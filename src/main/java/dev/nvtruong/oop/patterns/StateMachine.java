package dev.nvtruong.oop.patterns;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class StateMachine<S, E> {
    private record TransitionKey<S, E>(S state, E event) {}
    private final Map<TransitionKey<S, E>, S> transitions = new HashMap<>();
    private S state;

    public StateMachine(S initialState) {
        this.state = Objects.requireNonNull(initialState);
    }

    public StateMachine<S, E> allow(S from, E event, S to) {
        transitions.put(new TransitionKey<>(from, event), to);
        return this;
    }

    public S state() { return state; }

    public S fire(E event) {
        S next = transitions.get(new TransitionKey<>(state, event));
        if (next == null) throw new IllegalStateException("event " + event + " is invalid from " + state);
        state = next;
        return state;
    }
}
