package dev.nvtruong.oop.inheritance;

public sealed interface Shape permits CircleShape, RectangleShape {
    double area();
    double perimeter();
}
