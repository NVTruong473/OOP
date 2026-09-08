package dev.nvtruong.oop.io;

public final class SafeCalculator {
    private SafeCalculator() {}

    public static double calculate(double left, char operator, double right) {
        return switch (operator) {
            case '+' -> left + right;
            case '-' -> left - right;
            case '*' -> left * right;
            case '/' -> {
                if (right == 0.0) throw new ArithmeticException("division by zero");
                yield left / right;
            }
            default -> throw new IllegalArgumentException("unsupported operator: " + operator);
        };
    }
}
