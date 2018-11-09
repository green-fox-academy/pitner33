import java.util.Scanner;
public class excercise17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int sum = 0;

        System.out.println("Enter five integers: ");
        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt();
            sum = sum + number;
        }
        System.out.println("Sum: " + sum + ", Average: " + sum / 5);

    }
}
