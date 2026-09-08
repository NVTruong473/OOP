package dev.nvtruong.oop.inheritance;

public final class Square extends RectangleShape {
    public Square(double side) {
        super(side, side);
    }
    public double side() { return width(); }
}
