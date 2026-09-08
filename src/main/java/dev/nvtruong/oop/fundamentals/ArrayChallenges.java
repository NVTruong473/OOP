package dev.nvtruong.oop.fundamentals;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public final class ArrayChallenges {
    private ArrayChallenges() {}

    public static int max(int[] values) {
        requireNotEmpty(values);
        int max = values[0];
        for (int value : values) max = Math.max(max, value);
        return max;
    }

    public static int min(int[] values) {
        requireNotEmpty(values);
        int min = values[0];
        for (int value : values) min = Math.min(min, value);
        return min;
    }

    public static long sumEven(int[] values) {
        long sum = 0;
        for (int value : values) if (value % 2 == 0) sum += value;
        return sum;
    }

    public static int count(int[] values, int target) {
        int count = 0;
        for (int value : values) if (value == target) count++;
        return count;
    }

    public static int countPrimes(int[] values) {
        int count = 0;
        for (int value : values) if (isPrime(value)) count++;
        return count;
    }

    public static int findFirstIndex(int[] values, int target) {
        for (int i = 0; i < values.length; i++) if (values[i] == target) return i;
        return -1;
    }

    public static int[] squared(int[] values) {
        int[] result = Arrays.copyOf(values, values.length);
        for (int i = 0; i < result.length; i++) result[i] = Math.multiplyExact(result[i], result[i]);
        return result;
    }

    public static BigDecimal max(BigDecimal[] values) {
        if (values == null || values.length == 0) throw new IllegalArgumentException("array must not be empty");
        BigDecimal max = values[0];
        for (BigDecimal value : values) if (value.compareTo(max) > 0) max = value;
        return max;
    }

    public static int[] divisibleBy(int[] values, int divisor) {
        if (divisor == 0) throw new IllegalArgumentException("divisor must not be zero");
        return Arrays.stream(values).filter(v -> v % divisor == 0).toArray();
    }

    public static int thirdLargestDistinct(int[] values) {
        return Arrays.stream(values).distinct().boxed()
                .sorted((a, b) -> Integer.compare(b, a))
                .skip(2).findFirst()
                .orElseThrow(() -> new IllegalArgumentException("need at least 3 distinct values"));
    }

    public static boolean removeFirstInPlace(int[] values, int target) {
        int index = findFirstIndex(values, target);
        if (index < 0) return false;
        System.arraycopy(values, index + 1, values, index, values.length - index - 1);
        values[values.length - 1] = 0;
        return true;
    }

    public static void insertInPlace(int[] values, int index, int value) {
        if (index < 0 || index >= values.length) throw new IndexOutOfBoundsException(index);
        System.arraycopy(values, index, values, index + 1, values.length - index - 1);
        values[index] = value;
    }

    public static int[] duplicateValues(int[] values) {
        Set<Integer> seen = new LinkedHashSet<>();
        Set<Integer> duplicates = new LinkedHashSet<>();
        for (int value : values) if (!seen.add(value)) duplicates.add(value);
        return duplicates.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] distinctPreservingOrder(int[] values) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int value : values) set.add(value);
        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n % 2 == 0) return n == 2;
        for (int d = 3; (long) d * d <= n; d += 2) if (n % d == 0) return false;
        return true;
    }

    private static void requireNotEmpty(int[] values) {
        if (values == null || values.length == 0) throw new IllegalArgumentException("array must not be empty");
    }
}
