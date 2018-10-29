import java.util.Scanner;
import java.util.SortedMap;

public class excersise20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gimme TWO numbers, bastard! ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println(number1 + " is bigger, you lose!");
        } else {
            System.out.println(number2 + " is bigger, you loose!");
        }



    }
}
