package za.co.mocoder;

import java.util.Arrays;

public class Fundamentals {

    // Question 1: Count vowels (a, e, i, o, u), ignoring letter case.
    // Return 0 when the input is null or empty.
    public static int countVowels(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int count = 0;
        String lower = s.toLowerCase();

        for (int i = 0; i < lower.length(); i++) {
            char character = lower.charAt(i);
            if (character == 'a' || character == 'e' || character == 'i'
                    || character == 'o' || character == 'u') {
                count++;
            }
        }
        return count;
    }

    // Question 2: Return true when both strings contain the same letters
    // in any order, ignoring case and whitespace. Null inputs return false.
    public static boolean areAnagrams(String first, String second) {
        if (first == null || second == null) {
            return false;
        }

        String cleanedFirst = first.replaceAll("\\s+", "").toLowerCase();
        String cleanedSecond = second.replaceAll("\\s+", "").toLowerCase();

        if (cleanedFirst.isEmpty() || cleanedSecond.isEmpty()
                || cleanedFirst.length() != cleanedSecond.length()) {
            return false;
        }

        char[] firstLetters = cleanedFirst.toCharArray();
        char[] secondLetters = cleanedSecond.toCharArray();
        Arrays.sort(firstLetters);
        Arrays.sort(secondLetters);
        return Arrays.equals(firstLetters, secondLetters);
    }

    // Question 3: Describe whether an integer is positive, negative, or zero.
    public static String classifyNumber(int number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        }
        return "Zero";
    }

    // Question 4: Return the sum of the digits of an integer.
    // Negative signs are ignored; zero returns zero.
    public static int sumDigits(int number) {
        long remaining = Math.abs((long) number);
        int sum = 0;

        while (remaining > 0) {
            sum += (int) (remaining % 10);
            remaining /= 10;
        }
        return sum;
    }
}
