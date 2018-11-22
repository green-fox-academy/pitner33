package e04CountLetters;

import java.util.HashMap;
import java.util.Map;

public class CountLetter {

    public static Map<String, Integer> letterDictionary(String text) {
        Map<String, Integer> charMap = new HashMap<>();
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (charMap.containsKey(Character.toString(text.charAt(i)))) {
                charMap.put(Character.toString(text.charAt(i)), charMap.get(Character.toString(text.charAt(i))) +1);

            } else charMap.put(Character.toString(text.charAt(i)), 1);
        }
        return charMap;
    }
}
