import java.math.BigInteger;
import java.util.Scanner;
public class e05Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where is my number, eh? ");
        double number = scanner.nextInt();
        System.out.println(number + "! is: " + factorio(number));


    }
    public static double factorio(double nm) {
        double fact = 1;
        for (double i = 1; i <= nm; i++) {
            fact = fact * i;
        }
        return fact;

    }


}
