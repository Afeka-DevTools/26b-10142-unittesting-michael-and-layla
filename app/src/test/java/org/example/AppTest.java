package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class AppTest {

    @Test
    void testAdd() {
        assertEquals(5, App.add(2, 3));
        assertEquals(-1, App.add(-2, 1));
    }

    @Test
    void testIsPrime() {
        assertTrue(App.isPrime(7));
        assertFalse(App.isPrime(4));
        assertFalse(App.isPrime(1)); // Edge case: less than 2
        assertFalse(App.isPrime(-5)); // Edge case: negative
    }

    @Test
    void testReverse() {
        assertEquals("cba", App.reverse("abc"));
        assertEquals("", App.reverse("")); // Edge case: empty string
    }

    @Test
    void testFactorial() {
        assertEquals(120, App.factorial(5));
        assertEquals(1, App.factorial(0)); // Edge case: 0
        assertThrows(IllegalArgumentException.class, () -> App.factorial(-1)); // Exception path
    }

    @Test
    void testIsPalindrome() {
        assertTrue(App.isPalindrome("A man, a plan, a canal: Panama")); // Complex case
        assertTrue(App.isPalindrome("racecar"));
        assertFalse(App.isPalindrome("hello"));
    }

    @Test
    void testFibonacciUpTo() {
        List<Integer> expected = Arrays.asList(0, 1, 1, 2, 3, 5);
        assertEquals(expected, App.fibonacciUpTo(5));
        assertThrows(IllegalArgumentException.class, () -> App.fibonacciUpTo(-1)); // Exception path
    }

    @Test
    void testCharFrequency() {
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('a', 2);
        expected.put('b', 1);
        assertEquals(expected, App.charFrequency("aba"));
    }

    @Test
    void testIsAnagram() {
        assertTrue(App.isAnagram("Listen", "Silent")); // Case insensitive
        assertFalse(App.isAnagram("hello", "world"));
    }

    @Test
    void testAverage() {
        assertEquals(2.5, App.average(new int[]{2, 3}), 0.001);
        assertThrows(IllegalArgumentException.class, () -> App.average(new int[]{})); // Empty array path
    }

    @Test
    void testFilterEvens() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(2, 4);
        assertEquals(expected, App.filterEvens(input));
    }

    @Test
    void testMostCommonWord() {
        assertEquals("test", App.mostCommonWord("This is a test. A simple test! This test is good."));
    }
}
