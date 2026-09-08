package dev.nvtruong.oop.patterns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public final class EventBus {
    private final Map<Class<?>, List<Consumer<?>>> handlers = new HashMap<>();

    public <T> AutoCloseable subscribe(Class<T> eventType, Consumer<T> handler) {
        handlers.computeIfAbsent(eventType, ignored -> new ArrayList<>()).add(handler);
        return () -> handlers.getOrDefault(eventType, List.of()).remove(handler);
    }

    @SuppressWarnings("unchecked")
    public <T> void publish(T event) {
        if (event == null) throw new IllegalArgumentException("event must not be null");
        for (Consumer<?> raw : List.copyOf(handlers.getOrDefault(event.getClass(), List.of()))) {
            ((Consumer<T>) raw).accept(event);
        }
    }
}
