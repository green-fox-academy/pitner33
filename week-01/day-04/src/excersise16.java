import java.util.Scanner;
public class excersise16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many chickens do you have? ");
        int chicken = scanner.nextInt();

        System.out.println("How many pigs do you have? ");
        int pigs = scanner.nextInt();

        System.out.println("You have " + (2 * chicken + 4 * pigs) + " legs altogether in your courtyard (when you are not present)");

    }
}
