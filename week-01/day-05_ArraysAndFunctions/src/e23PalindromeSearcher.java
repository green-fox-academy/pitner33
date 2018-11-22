import java.util.Scanner;
import java.util.Arrays;
public class e23PalindromeSearcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("We will search palindromes today. Are you ready?");
        System.out.println("Give me a sentence then... ");
        String sentence = scanner.nextLine();


        System.out.println(palindromeSearcher(sentence).toString());
    }
    public static String[] palindromeSearcher(String a) {
        int counter = 0;
        for (int i = 1; i <= (a.length() / 2); i++) {
            for (int j = 1; j <= i; j++) {
                if ((a.charAt(i-j) == a.charAt(i+j))
                        || ((a.charAt(i) == a.charAt(i+j)) && ((a.charAt(i-j) == a.charAt(i+j+1)) && (j != i)))
                        || ((a.charAt(i) == a.charAt(i-j)) && (a.charAt(i-j-1) == a.charAt(i+j)))){
                    counter++;
                }
            }
        }
        for (int i = (a.length() / 2); i < a.length(); i++) {
            for (int j = 1; j < (a.length() - i); j++) {
                if ((a.charAt(i-j) == a.charAt(i+j))
                        || ((a.charAt(i) == a.charAt(i+j)) && ((a.charAt(i-j) == a.charAt(i+j+1)) && (j != i)))
                        || ((a.charAt(i) == a.charAt(i-j)) && (a.charAt(i-j-1) == a.charAt(i+j)))) {
                    counter++;
                }
            }
        }
        String[] palindromes = new String[counter];
        int k = 0;
        for (int i = 1; i <= (a.length() / 2); i++) {
            for (int j = 1; j <= i; j++) {
                if (a.charAt(i-j) == a.charAt(i+j)) {
                        palindromes[k] = a.substring(i-j, i+j+1);
                        k++;
                } else if ((a.charAt(i) == a.charAt(i+j)) && ((a.charAt(i-j) == a.charAt(i+j+1)) && (j != i))) {
                        palindromes[k] = a.substring(i - j, i + j + 1);
                         k++;
                } else if ((a.charAt(i) == a.charAt(i-j)) && (a.charAt(i-j-1) == a.charAt(i+j))) {
                        palindromes[k] = a.substring(i-j-1, i+j);
                        k++;
                }
            }

        }
        for (int i = (a.length() / 2); i < a.length(); i++) {
            for (int j = 1; j < (a.length() - i); j++) {
                if (a.charAt(i-j) == a.charAt(i+j)) {
                    palindromes[k] = a.substring(i-j, i+j+1);
                    k++;
                } else if ((a.charAt(i) == a.charAt(i+j)) && ((a.charAt(i-j) == a.charAt(i+j+1)) && (j != i))) {
                    palindromes[k] = a.substring(i - j, i + j + 1);
                    k++;
                } else if ((a.charAt(i) == a.charAt(i-j)) && (a.charAt(i-j-1) == a.charAt(i+j))) {
                    palindromes[k] = a.substring(i-j-1, i+j);
                    k++;
                }

            }


        }
        return palindromes;


    }

}
