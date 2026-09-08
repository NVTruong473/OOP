package dev.nvtruong.oop.model;

public final class RegularPolygon {
    private final int sides;
    private final double sideLength;

    public RegularPolygon(int sides, double sideLength) {
        if (sides < 3) throw new IllegalArgumentException("a polygon needs at least 3 sides");
        if (sideLength <= 0) throw new IllegalArgumentException("side length must be positive");
        this.sides = sides;
        this.sideLength = sideLength;
    }

    public int sides() { return sides; }
    public double sideLength() { return sideLength; }
    public double perimeter() { return sides * sideLength; }

    public double area() {
        return sides * sideLength * sideLength / (4.0 * Math.tan(Math.PI / sides));
    }
}
