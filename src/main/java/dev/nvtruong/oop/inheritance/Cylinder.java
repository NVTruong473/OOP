package dev.nvtruong.oop.inheritance;

public final class Cylinder extends Circle {
    private final double height;

    public Cylinder(double radius, double height) {
        super(radius);
        if (height <= 0) throw new IllegalArgumentException("height must be positive");
        this.height = height;
    }

    public double height() { return height; }
    public double volume() { return area() * height; }
}
