package dev.nvtruong.oop.inheritance;

import dev.nvtruong.oop.model.Point2D;

public final class Point3D {
    private final Point2D base;
    private final float z;

    public Point3D(float x, float y, float z) {
        this.base = new Point2D(x, y);
        this.z = z;
    }

    public float x() { return base.x(); }
    public float y() { return base.y(); }
    public float z() { return z; }
}
