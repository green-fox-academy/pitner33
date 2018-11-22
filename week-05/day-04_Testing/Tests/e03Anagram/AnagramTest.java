package e03Anagram;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnagramTest {
//    Anagram testAnagram;
//
//    @BeforeEach
//    void before() {
//        testAnagram = new Anagram();
//    }

    @Test
    void testIsAnagram() {
        assertTrue(Anagram.isAnagram("dog", "god"));
    }

    @Test
    void testIsAnagram2() {
        assertTrue(Anagram.isAnagram("dog eat", "god tea"));
    }

    @Test
    void testIsAnagram3() {
        assertFalse(Anagram.isAnagram("dog", "got"));
    }

    @Test
    void testIsAnagram4() {
        assertFalse(Anagram.isAnagram("dog", "do"));
    }
}