package dev.nvtruong.oop.inheritance;

public class Employee {
    private final String id;
    private final String name;
    private final double baseSalary;

    public Employee(String id, String name, double baseSalary) {
        if (id == null || id.isBlank() || name == null || name.isBlank())
            throw new IllegalArgumentException("id and name are required");
        if (baseSalary < 0) throw new IllegalArgumentException("salary must be non-negative");
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String id() { return id; }
    public String name() { return name; }
    public double baseSalary() { return baseSalary; }
    public double salary() { return baseSalary; }
}
