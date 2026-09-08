package dev.nvtruong.oop.inheritance;

public abstract class Learner {
    private final String name;
    private final double gpa;

    protected Learner(String name, double gpa) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("name must not be blank");
        if (gpa < 0 || gpa > 10) throw new IllegalArgumentException("GPA must be in [0,10]");
        this.name = name;
        this.gpa = gpa;
    }

    public String name() { return name; }
    public double gpa() { return gpa; }
    public abstract String rank();
}
