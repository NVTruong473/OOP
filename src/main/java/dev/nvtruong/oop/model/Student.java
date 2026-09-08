package dev.nvtruong.oop.model;

import java.util.Objects;

public final class Student {
    private final int id;
    private final String firstName;
    private final String lastName;

    public Student(int id, String firstName, String lastName) {
        if (id < 0) throw new IllegalArgumentException("id must be non-negative");
        this.id = id;
        this.firstName = requireName(firstName);
        this.lastName = requireName(lastName);
    }

    public int id() { return id; }
    public String firstName() { return firstName; }
    public String lastName() { return lastName; }
    public String fullName() { return firstName + " " + lastName; }

    private static String requireName(String value) {
        Objects.requireNonNull(value);
        if (value.isBlank()) throw new IllegalArgumentException("name must not be blank");
        return value.trim();
    }

    @Override public String toString() {
        return "Student[" + id + "," + firstName + "," + lastName + "]";
    }
}
