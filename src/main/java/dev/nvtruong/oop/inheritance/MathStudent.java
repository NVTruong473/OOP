package dev.nvtruong.oop.inheritance;

public final class MathStudent extends Learner {
    public MathStudent(String name, double gpa) { super(name, gpa); }
    @Override public String rank() {
        if (gpa() >= 8.0) return "A";
        if (gpa() >= 5.0) return "Passed";
        return "Failed";
    }
}
