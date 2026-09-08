package dev.nvtruong.oop.inheritance;

public final class Manager extends Employee {
    private final double allowance;

    public Manager(String id, String name, double baseSalary, double allowance) {
        super(id, name, baseSalary);
        if (allowance < 0) throw new IllegalArgumentException("allowance must be non-negative");
        this.allowance = allowance;
    }

    public double allowance() { return allowance; }
    @Override public double salary() { return baseSalary() + allowance; }
}
