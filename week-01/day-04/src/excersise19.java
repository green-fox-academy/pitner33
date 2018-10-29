import java.util.Scanner;
public class excersise19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gimme a number, bastard! ");
        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Not enough!");
        } else if (number == 1) {
            System.out.println("One");
        } else if (number == 2) {
            System.out.println("Two");
        } else {
            System.out.println("Too much - you loose");
        }


    }
}
