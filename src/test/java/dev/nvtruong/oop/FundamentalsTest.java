package dev.nvtruong.oop;

import dev.nvtruong.oop.fundamentals.ArrayChallenges;
import dev.nvtruong.oop.fundamentals.MatrixChallenges;
import dev.nvtruong.oop.fundamentals.NumberChallenges;
import dev.nvtruong.oop.fundamentals.StringChallenges;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FundamentalsTest {
    @Test void solvesLegacyNumberExercises() {
        assertEquals(6.0, NumberChallenges.triangleArea(3, 4));
        assertEquals(1, NumberChallenges.remainder(7, 3));
        assertEquals(32.0, NumberChallenges.celsiusToFahrenheit(0));
        assertTrue(NumberChallenges.isLeapYear(2000));
        assertFalse(NumberChallenges.isLeapYear(1900));
        assertEquals(3, NumberChallenges.minOfThree(9, 3, 8));
        assertEquals(120, NumberChallenges.factorial(5));
        assertEquals(List.of(6L, 3L, 10L, 5L, 16L, 8L, 4L, 2L, 1L), NumberChallenges.hailstone(6));
        assertEquals(6, NumberChallenges.sumFirstAndLastDigit(12345));
        assertEquals(5, NumberChallenges.digitCount(12345));
        assertEquals(54321, NumberChallenges.reverseNumber(12345));
        assertTrue(NumberChallenges.isPalindromeNumber(12321));
    }

    @Test void solvesLegacyArrayExercises() {
        int[] values = {1, 3, 1, 3, 2, 4, 6};
        assertEquals(6, ArrayChallenges.max(values));
        assertEquals(1, ArrayChallenges.min(values));
        assertEquals(12, ArrayChallenges.sumEven(values));
        assertEquals(2, ArrayChallenges.count(values, 3));
        assertEquals(3, ArrayChallenges.countPrimes(values));
        assertEquals(1, ArrayChallenges.findFirstIndex(values, 3));
        assertArrayEquals(new int[]{1, 9}, ArrayChallenges.squared(new int[]{1, 3}));
        assertEquals(new BigDecimal("9.1"), ArrayChallenges.max(new BigDecimal[]{
                new BigDecimal("2.1"), new BigDecimal("9.1")}));
        assertArrayEquals(new int[]{2, 4, 6}, ArrayChallenges.divisibleBy(new int[]{1,2,3,4,5,6}, 2));
        assertEquals(4, ArrayChallenges.thirdLargestDistinct(new int[]{9,7,4,9,3}));
        assertArrayEquals(new int[]{1,3}, ArrayChallenges.duplicateValues(values));
        assertArrayEquals(new int[]{1,3,2,4,6}, ArrayChallenges.distinctPreservingOrder(values));
    }

    @Test void handlesLegacyMatrixAndStringExercises() {
        int[][] a = {{1,2},{3,4}};
        int[][] b = {{5,6},{7,8}};
        assertArrayEquals(new int[][]{{6,8},{10,12}}, MatrixChallenges.add(a,b));
        assertEquals("1 2\n3 4", MatrixChallenges.format(a).replace("\r\n", "\n"));

        assertEquals("Nguyen Chien", StringChallenges.firstAndLastName("Nguyen Van Chien"));
        assertEquals("Thi Thu", StringChallenges.middleName("Nguyen Thi Thu Thao"));
        assertEquals("Nguyen Van Chien", StringChallenges.capitalizeFullName("nguyen vAN CHIEN"));
        assertEquals("ngUyEn vAn chIEn", StringChallenges.vowelsUpperConsonantsLower("Nguyen Van Chien"));
        assertEquals(3, StringChallenges.wordCount("one  two\nthree"));
        assertTrue(StringChallenges.isPalindrome("A man, a plan, a canal: Panama"));
        assertEquals(2, StringChallenges.wordFrequency("You you me").get("you"));
    }
}
