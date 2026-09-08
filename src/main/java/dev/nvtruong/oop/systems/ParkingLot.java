package dev.nvtruong.oop.systems;

import java.time.Duration;
import java.time.Instant;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public final class ParkingLot {
    public enum Size { MOTORBIKE, COMPACT, LARGE }
    public record Vehicle(String plate, Size size) {
        public Vehicle {
            Objects.requireNonNull(plate);
            Objects.requireNonNull(size);
            if (plate.isBlank()) throw new IllegalArgumentException("plate must not be blank");
        }
    }
    public record Ticket(String spotId, Vehicle vehicle, Instant enteredAt) {}
    public record Receipt(Ticket ticket, Instant exitedAt, long chargedHours) {}

    private static final class Spot {
        final String id;
        final Size size;
        Vehicle vehicle;
        Spot(String id, Size size) { this.id = id; this.size = size; }
    }

    private final Map<String, Spot> spots = new LinkedHashMap<>();

    public void addSpot(String id, Size size) {
        if (spots.putIfAbsent(id, new Spot(id, size)) != null) throw new IllegalArgumentException("duplicate spot");
    }

    public Ticket park(Vehicle vehicle, Instant now) {
        for (Spot spot : spots.values()) {
            if (spot.vehicle == null && fits(vehicle.size(), spot.size)) {
                spot.vehicle = vehicle;
                return new Ticket(spot.id, vehicle, now);
            }
        }
        throw new IllegalStateException("no compatible spot available");
    }

    public Receipt leave(Ticket ticket, Instant now) {
        Spot spot = spots.get(ticket.spotId());
        if (spot == null || spot.vehicle == null || !spot.vehicle.equals(ticket.vehicle()))
            throw new IllegalStateException("invalid ticket");
        if (now.isBefore(ticket.enteredAt())) throw new IllegalArgumentException("exit before entry");
        spot.vehicle = null;
        long minutes = Duration.between(ticket.enteredAt(), now).toMinutes();
        long hours = Math.max(1, (minutes + 59) / 60);
        return new Receipt(ticket, now, hours);
    }

    private boolean fits(Size vehicle, Size spot) {
        return vehicle.ordinal() <= spot.ordinal();
    }
}
