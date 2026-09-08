package dev.nvtruong.oop.model;

public record Point2D(float x, float y) {
    public Point2D() { this(0.0f, 0.0f); }

    public double distanceTo(Point2D other) {
        double dx = other.x - x;
        double dy = other.y - y;
        return Math.hypot(dx, dy);
    }
}
