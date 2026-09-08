package dev.nvtruong.oop.inheritance;

public final class ITStudent extends Learner {
    public ITStudent(String name, double gpa) { super(name, gpa); }
    @Override public String rank() {
        if (gpa() >= 8.5) return "A";
        if (gpa() >= 5.0) return "Passed";
        return "Failed";
    }
}
