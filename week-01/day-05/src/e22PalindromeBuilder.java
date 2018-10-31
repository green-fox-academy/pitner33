import java.util.Scanner;
import java.util.Arrays;
public class e22PalindromeBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I wanna build a palindrome. I know you haven't got the faintest idea what the heck is that, but who cares. Just gimme a word and watch! ");
        String word = scanner.nextLine();

        CreatePalindrome(word);

    }

    public static void CreatePalindrome(String a) {
        System.out.print(a);
        for (int i = a.length()-1; i >= 0; i--) {
            System.out.print(a.charAt(i));
        }
        System.out.println(" ");
    }
}
