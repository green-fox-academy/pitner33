import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class e23PalindromeSearcherVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("We will search palindromes today. Are you ready?");
        System.out.println("Give me a sentence then... ");
        String sentence = scanner.nextLine();

        System.out.println(palindromeSearcher(sentence));
    }
    public static String palindromeSearcher(String a) {
        int j = 1;
        int count = 0;
        ArrayList<String> palindromeContainer = new ArrayList();
        for (int i = 1; i < (a.length() - 1); i++) {
            if (a.charAt(i) == a.charAt(i+1)) {
                while ((a.charAt(i - j) == a.charAt(i + j + 1)) && (i < a.length() - 2) && (j < a.length() - i - 2)) {
                    count++;
                    palindromeContainer.add(a.substring(i-j-1, i+j+2));
                    j++;
                }
                if ((j == a.length() -i -2) && (a.charAt(i - j) == a.charAt( i + j +1))) {
                    count++;
                    palindromeContainer.add(a.substring(i-j, i+j+2));
                } else if (( i == a.length() - 2) && (a.charAt(i - j) == a.charAt(i + j + 1))) {
                    count++;
                    palindromeContainer.add(a.substring(i-j, i+j+2));
                }
            } else while ((a.charAt(i - j) == a.charAt(i + j)) && (i < a.length() - 2) && (j < a.length() - i - 1)) {
                        count++;
                        palindromeContainer.add(a.substring(i-j, i+j+1));
                        j++;
                    }
                    if ((j == a.length() - i - 1) && (a.charAt(i - j) == a.charAt(i + j))) {
                        count++;
                        palindromeContainer.add(a.substring(i-j, i+j+1));

                    } else if ((i == a.length() - 2) && (a.charAt(i - j) == a.charAt(i + j))) {
                        count++;
                        palindromeContainer.add(a.substring(i-j, i+j+1));
                    }
            j = 1;
        }
        System.out.println(count);
        String palindromeList = palindromeContainer.toString();
//        System.out.println(palindromeList);
        return palindromeList;
    }
}
