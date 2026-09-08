package dev.nvtruong.oop.avl;

import java.util.Objects;

public record StudentRecord(int id, String name, int score) {
    public StudentRecord {
        if (id < 0) throw new IllegalArgumentException("id must be non-negative");
        Objects.requireNonNull(name);
        if (name.isBlank()) throw new IllegalArgumentException("name must not be blank");
        if (score < 0 || score > 100) throw new IllegalArgumentException("score must be in [0,100]");
        name = name.trim();
    }
}
