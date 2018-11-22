package e04CountLetters;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CountLetterTest {
    private String testText;
    private Map<String, Integer> testMap;

    @Test
    void letterDictionary() {
        testText = "example";
        testMap = new HashMap<>();
        testMap.put("e", 2);
        testMap.put("x", 1);
        testMap.put("a", 1);
        testMap.put("m", 1);
        testMap.put("p", 1);
        testMap.put("l", 1);
        assertEquals(testMap, CountLetter.letterDictionary(testText));

    }
}