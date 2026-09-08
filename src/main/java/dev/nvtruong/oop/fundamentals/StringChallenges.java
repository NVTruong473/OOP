package dev.nvtruong.oop.fundamentals;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class StringChallenges {
    private static final Pattern WORD = Pattern.compile("[\\p{L}\\p{N}']+");
    private StringChallenges() {}

    public static String firstAndLastName(String fullName) {
        String[] parts = normalizedParts(fullName);
        if (parts.length == 1) return parts[0];
        return parts[0] + " " + parts[parts.length - 1];
    }

    public static String middleName(String fullName) {
        String[] parts = normalizedParts(fullName);
        if (parts.length <= 2) return "";
        return String.join(" ", java.util.Arrays.copyOfRange(parts, 1, parts.length - 1));
    }

    public static String capitalizeFullName(String fullName) {
        String[] parts = normalizedParts(fullName);
        StringBuilder result = new StringBuilder();
        for (String part : parts) {
            if (!result.isEmpty()) result.append(' ');
            result.append(Character.toUpperCase(part.charAt(0)));
            if (part.length() > 1) result.append(part.substring(1).toLowerCase(Locale.ROOT));
        }
        return result.toString();
    }

    public static String vowelsUpperConsonantsLower(String text) {
        String lower = text.toLowerCase(Locale.ROOT);
        StringBuilder out = new StringBuilder(lower.length());
        for (char ch : lower.toCharArray())
            out.append("aeiou".indexOf(ch) >= 0 ? Character.toUpperCase(ch) : ch);
        return out.toString();
    }

    public static int length(String text) {
        return text.length();
    }

    public static int wordCount(String text) {
        int count = 0;
        Matcher matcher = WORD.matcher(text);
        while (matcher.find()) count++;
        return count;
    }

    public static String concatenate(String first, String second) {
        return first + second;
    }

    public static boolean isPalindrome(String text) {
        String normalized = text.replaceAll("[^\\p{L}\\p{N}]", "").toLowerCase(Locale.ROOT);
        int left = 0, right = normalized.length() - 1;
        while (left < right) if (normalized.charAt(left++) != normalized.charAt(right--)) return false;
        return true;
    }

    public static Map<String, Integer> wordFrequency(String paragraph) {
        Map<String, Integer> counts = new LinkedHashMap<>();
        Matcher matcher = WORD.matcher(paragraph.toLowerCase(Locale.ROOT));
        while (matcher.find()) counts.merge(matcher.group(), 1, Integer::sum);
        return Map.copyOf(counts);
    }

    private static String[] normalizedParts(String fullName) {
        if (fullName == null || fullName.isBlank()) throw new IllegalArgumentException("name must not be blank");
        return fullName.trim().split("\\s+");
    }
}
