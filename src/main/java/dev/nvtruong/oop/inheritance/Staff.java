package dev.nvtruong.oop.inheritance;

public final class Staff extends Person {
    private final String school;
    private final double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        if (school == null || school.isBlank()) throw new IllegalArgumentException("school must not be blank");
        if (pay < 0) throw new IllegalArgumentException("pay must be non-negative");
        this.school = school;
        this.pay = pay;
    }

    public String school() { return school; }
    public double pay() { return pay; }
}
