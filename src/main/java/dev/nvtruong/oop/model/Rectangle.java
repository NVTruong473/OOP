package dev.nvtruong.oop.model;

public final class Rectangle {
    private final double width;
    private final double length;

    public Rectangle() { this(1.0, 1.0); }

    public Rectangle(double width, double length) {
        if (width <= 0 || length <= 0) throw new IllegalArgumentException("dimensions must be positive");
        this.width = width;
        this.length = length;
    }

    public double width() { return width; }
    public double length() { return length; }
    public double area() { return width * length; }
    public double perimeter() { return 2 * (width + length); }

    @Override public String toString() {
        return "Rectangle[" + width + "," + length + "]";
    }
}
