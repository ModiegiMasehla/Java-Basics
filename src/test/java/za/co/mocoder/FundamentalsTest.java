package za.co.mocoder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName(" Java Basics")
class FundamentalsTest {

    @Nested
    @DisplayName("countVowels()")
    class CountVowelsTests {
        @ParameterizedTest
        @CsvSource({"hello,2", "EDUCATION,5", "rhythm,0", "Java Programming,5", "AEIOU,5"})
        void countsVowelsIgnoringCase(String input, int expected) {
            assertEquals(expected, Fundamentals.countVowels(input));
        }

        @ParameterizedTest
        @NullAndEmptySource
        void nullOrEmptyReturnsZero(String input) {
            assertEquals(0, Fundamentals.countVowels(input));
        }

        @Test
        void ignoresNumbersAndPunctuation() {
            assertEquals(0, Fundamentals.countVowels("h3ll0!"));
        }
    }

    @Nested
    @DisplayName("areAnagrams()")
    class AnagramTests {
        @ParameterizedTest
        @CsvSource({"listen,silent", "Dormitory,Dirtyroom", "'' ,''"})
        void anagramExamples(String first, String second) {
            if (first.isEmpty() || second.isEmpty()) {
                assertFalse(Fundamentals.areAnagrams(first, second));
            } else {
                assertTrue(Fundamentals.areAnagrams(first, second));
            }
        }

        @ParameterizedTest
        @CsvSource({"hello,world", "cat,cars", "a,ab"})
        void differentLettersAreNotAnagrams(String first, String second) {
            assertFalse(Fundamentals.areAnagrams(first, second));
        }

        @Test
        void ignoresSpacesAndCase() {
            assertTrue(Fundamentals.areAnagrams("School master", "The classroom"));
        }

        @Test
        void nullReturnsFalse() {
            assertFalse(Fundamentals.areAnagrams(null, "abc"));
            assertFalse(Fundamentals.areAnagrams("abc", null));
        }
    }

    @Nested
    @DisplayName("classifyNumber()")
    class ClassifyNumberTests {
        @ParameterizedTest
        @CsvSource({"1,Positive", "99,Positive", "-1,Negative", "-42,Negative", "0,Zero"})
        void classifiesNumbers(int input, String expected) {
            assertEquals(expected, Fundamentals.classifyNumber(input));
        }
    }

    @Nested
    @DisplayName("sumDigits()")
    class SumDigitsTests {
        @ParameterizedTest
        @CsvSource({"123,6", "9001,10", "7,7", "0,0", "-456,15", "100000,1", "-2147483648,47"})
        void sumsDigits(int input, int expected) {
            assertEquals(expected, Fundamentals.sumDigits(input));
        }
    }
}
