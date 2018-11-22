import java.util.Scanner;
public class excercise18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gimme a number, bastard! ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even - I won, haha!");
        } else {
            System.out.println("Odds - I won, haha!");
        }
    }


}
