package dev.nvtruong.oop.inheritance;

public non-sealed class RectangleShape implements Shape {
    private final double width;
    private final double height;

    public RectangleShape(double width, double height) {
        if (width <= 0 || height <= 0) throw new IllegalArgumentException("dimensions must be positive");
        this.width = width;
        this.height = height;
    }

    public double width() { return width; }
    public double height() { return height; }
    @Override public double area() { return width * height; }
    @Override public double perimeter() { return 2 * (width + height); }
}
