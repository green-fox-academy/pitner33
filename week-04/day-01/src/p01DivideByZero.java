import java.util.Scanner;

public class p01DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gimme a number, bastard... ");
        int num = scanner.nextInt();

        divide(num);
    }

    public static void divide(int number) {

        try {
            int result = 10 / number;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero");
            e.printStackTrace();
        }
    }




}