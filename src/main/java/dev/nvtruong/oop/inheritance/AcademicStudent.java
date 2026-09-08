package dev.nvtruong.oop.inheritance;

public final class AcademicStudent extends Person {
    private final String program;
    private final int year;
    private final double fee;

    public AcademicStudent(String name, String address, String program, int year, double fee) {
        super(name, address);
        if (program == null || program.isBlank()) throw new IllegalArgumentException("program must not be blank");
        if (year < 1) throw new IllegalArgumentException("year must be positive");
        if (fee < 0) throw new IllegalArgumentException("fee must be non-negative");
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String program() { return program; }
    public int year() { return year; }
    public double fee() { return fee; }
}
