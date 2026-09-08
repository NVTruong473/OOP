package dev.nvtruong.oop.inheritance;

public final class CircleShape implements Shape {
    private final double radius;

    public CircleShape(double radius) {
        if (radius <= 0) throw new IllegalArgumentException("radius must be positive");
        this.radius = radius;
    }

    @Override public double area() { return Math.PI * radius * radius; }
    @Override public double perimeter() { return 2 * Math.PI * radius; }
}
