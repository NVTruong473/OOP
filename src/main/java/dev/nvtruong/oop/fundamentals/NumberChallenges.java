package dev.nvtruong.oop.fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Legacy Lab01 rewritten as pure, testable functions.
 * The original method names are documented in docs/LEGACY_MIGRATION.md.
 */
public final class NumberChallenges {
    private NumberChallenges() {}

    public record StudentIdentity(String name, String dateOfBirth, String studentId) {
        public StudentIdentity {
            Objects.requireNonNull(name);
            Objects.requireNonNull(dateOfBirth);
            Objects.requireNonNull(studentId);
        }
    }

    public static double triangleArea(double base, double height) {
        if (base < 0 || height < 0) throw new IllegalArgumentException("base and height must be non-negative");
        return base * height / 2.0;
    }

    public static int remainder(int dividend, int divisor) {
        if (divisor == 0) throw new ArithmeticException("division by zero");
        return dividend % divisor;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static int minOfThree(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    public enum CharacterKind { DIGIT, LETTER, OTHER }

    public static CharacterKind classifyAscii(char ch) {
        if (ch >= '0' && ch <= '9') return CharacterKind.DIGIT;
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) return CharacterKind.LETTER;
        return CharacterKind.OTHER;
    }

    public static long sumToN(int n) {
        requireNonNegative(n);
        return (long) n * (n + 1) / 2;
    }

    public static long factorial(int n) {
        requireNonNegative(n);
        long result = 1;
        for (int i = 2; i <= n; i++) result = Math.multiplyExact(result, i);
        return result;
    }

    public static long powersOfTwoSum(int n) {
        requireNonNegative(n);
        if (n >= 63) throw new ArithmeticException("result exceeds signed long");
        return (1L << (n + 1)) - 1;
    }

    public static double harmonicHalfSeries(int n) {
        requireNonNegative(n);
        double sum = 0;
        for (int i = 1; i <= n; i++) sum += 1.0 / (2.0 * i);
        return sum;
    }

    public static long sumSquaresToN(int n) {
        requireNonNegative(n);
        return Math.multiplyExact(Math.multiplyExact((long) n, n + 1), 2L * n + 1) / 6;
    }

    public static List<Long> hailstone(long n) {
        if (n <= 0) throw new IllegalArgumentException("n must be positive");
        List<Long> sequence = new ArrayList<>();
        sequence.add(n);
        while (n != 1) {
            n = n % 2 == 0 ? n / 2 : Math.addExact(Math.multiplyExact(n, 3), 1);
            sequence.add(n);
        }
        return List.copyOf(sequence);
    }

    public static int sumFirstAndLastDigit(long value) {
        long n = Math.abs(value);
        int last = (int) (n % 10);
        while (n >= 10) n /= 10;
        return (int) n + last;
    }

    public static int digitCount(long value) {
        if (value == 0) return 1;
        long n = Math.abs(value);
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static long reverseNumber(long value) {
        boolean negative = value < 0;
        long n = Math.abs(value);
        long reversed = 0;
        while (n > 0) {
            reversed = Math.addExact(Math.multiplyExact(reversed, 10), n % 10);
            n /= 10;
        }
        return negative ? -reversed : reversed;
    }

    public static boolean isPalindromeNumber(long value) {
        return value >= 0 && value == reverseNumber(value);
    }

    private static void requireNonNegative(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");
    }
}
