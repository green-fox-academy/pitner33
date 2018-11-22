import java.util.Scanner;
import java.util.Arrays;
public class e21Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word1 = scanner.nextLine();
        System.out.println("Enter a scond word: ");
        String word2 = scanner.nextLine();


        if (length(word1, word2)) {
            if (anagram(word1, word2)) {
                System.out.println("These are anagrams");
            } System.out.println("These are not anagrams");
        } else System.out.println("These are not anagrams");
    }

    //Decides if the two string are equal in length or not - true when equal
    public static  boolean length(String a, String b){
        boolean equalLength = false;
        if (a.length() == b.length()) {
            equalLength = true;
        }
        return equalLength;
    }

//    Check if all the characters of the firs word are in the second one
//    true if yes
    public static boolean anagram(String a, String b) {
        Character[] array1 = new Character[a.length()];
        Character[] array2 = new Character[b.length()];

        for (int i = 0; i < a.length(); i++) {
            array1[i] = a.charAt(i);
        }

        for (int i = 0; i < b.length(); i++) {
            array2[i] = b.charAt(i);
        }

//        int nr1 = 1;
        int count = 0;
        boolean anagr = true;
        for (int i = 0; i < array1.length; i++) {
            count = 0;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    count++;
                }

            }
            if ((count == 0) || (count > 1)) {
                anagr = false;
            }


        }
        return anagr;
    }
}
