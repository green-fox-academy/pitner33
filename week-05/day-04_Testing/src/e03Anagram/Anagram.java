package e03Anagram;

import java.util.Arrays;
import java.util.Collections;

public class Anagram {

    public static boolean isAnagram(String text1, String text2) {
        String temp1 = text1.replace(" ", "");
        String temp2 = text2.replace(" ", "");

        if (temp1.length() != temp2.length()) {
            return false;
        } else {
            char[] temp1Array = temp1.toCharArray();
            char[] temp2Array = temp2.toCharArray();
            Arrays.sort(temp1Array);
            Arrays.sort(temp2Array);
            return Arrays.equals(temp1Array, temp2Array);


            /*for (int i = 0; i < temp1.length(); i++) {
                if (temp2.contains(Character.toString(temp1.charAt(i)))) {
                    temp1.replace(Character.toString(temp1.charAt(i)), "");
                }
            }
            return temp2.isEmpty();*/
        }
    }
}
