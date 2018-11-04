import java.util.Scanner;
public class e34ParametricAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" How many numbers would you like to work with? ");
        int num = scanner.nextInt();

        System.out.println("Enter them one by one...");
        float numbers = 0;
        float sum = 0;
        for (int i = 0; i < num; i++) {
            numbers = scanner.nextFloat();
            sum = sum + numbers;
        }
        Float average = sum / num;

        System.out.println("Sum: " + sum + ", Average: " + average);

    }
}
