package dev.nvtruong.oop.systems;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class BookingService {
    public enum Status { CONFIRMED, CANCELLED }
    public record Booking(String id, String resourceId, LocalDate start, LocalDate end, Status status) {
        public Booking {
            Objects.requireNonNull(id);
            Objects.requireNonNull(resourceId);
            Objects.requireNonNull(start);
            Objects.requireNonNull(end);
            Objects.requireNonNull(status);
            if (!end.isAfter(start)) throw new IllegalArgumentException("end must be after start");
        }
        Booking cancel() { return new Booking(id, resourceId, start, end, Status.CANCELLED); }
    }

    private final Map<String, Booking> bookings = new HashMap<>();

    public Booking book(String id, String resourceId, LocalDate start, LocalDate end) {
        if (bookings.containsKey(id)) throw new IllegalArgumentException("duplicate booking id");
        boolean overlaps = bookings.values().stream()
                .filter(b -> b.status() == Status.CONFIRMED && b.resourceId().equals(resourceId))
                .anyMatch(b -> start.isBefore(b.end()) && end.isAfter(b.start()));
        if (overlaps) throw new IllegalStateException("resource unavailable");
        Booking booking = new Booking(id, resourceId, start, end, Status.CONFIRMED);
        bookings.put(id, booking);
        return booking;
    }

    public Booking cancel(String id) {
        Booking booking = bookings.get(id);
        if (booking == null) throw new IllegalArgumentException("booking not found");
        Booking cancelled = booking.cancel();
        bookings.put(id, cancelled);
        return cancelled;
    }
}
