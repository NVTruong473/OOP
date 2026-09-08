package dev.nvtruong.oop.inheritance;

public class Circle {
    private final double radius;

    public Circle(double radius) {
        if (radius <= 0) throw new IllegalArgumentException("radius must be positive");
        this.radius = radius;
    }

    public double radius() { return radius; }
    public double area() { return Math.PI * radius * radius; }
}
