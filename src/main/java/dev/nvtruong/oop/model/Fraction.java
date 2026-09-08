package dev.nvtruong.oop.model;

public record Fraction(long numerator, long denominator) {
    public Fraction {
        if (denominator == 0) throw new IllegalArgumentException("denominator must not be zero");
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        long gcd = gcd(Math.abs(numerator), denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    public Fraction add(Fraction other) {
        return new Fraction(
                Math.addExact(Math.multiplyExact(numerator, other.denominator),
                              Math.multiplyExact(other.numerator, denominator)),
                Math.multiplyExact(denominator, other.denominator));
    }

    public Fraction multiply(Fraction other) {
        return new Fraction(Math.multiplyExact(numerator, other.numerator),
                            Math.multiplyExact(denominator, other.denominator));
    }

    public double asDouble() { return (double) numerator / denominator; }

    private static long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a == 0 ? 1 : a;
    }
}
