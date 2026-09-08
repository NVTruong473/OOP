package dev.nvtruong.oop.systems;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class NotificationService {
    public interface Channel {
        String name();
        void send(String recipient, String message);
    }

    public record Delivery(String channel, String recipient, boolean success, String error) {}

    private final List<Channel> channels = new ArrayList<>();

    public NotificationService register(Channel channel) {
        channels.add(Objects.requireNonNull(channel));
        return this;
    }

    public List<Delivery> broadcast(String recipient, String message) {
        if (recipient == null || recipient.isBlank()) throw new IllegalArgumentException("recipient required");
        if (message == null || message.isBlank()) throw new IllegalArgumentException("message required");
        List<Delivery> deliveries = new ArrayList<>();
        for (Channel channel : channels) {
            try {
                channel.send(recipient, message);
                deliveries.add(new Delivery(channel.name(), recipient, true, null));
            } catch (RuntimeException ex) {
                deliveries.add(new Delivery(channel.name(), recipient, false, ex.getMessage()));
            }
        }
        return List.copyOf(deliveries);
    }
}
