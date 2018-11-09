import java.util.Scanner;
public class excercise26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Two numbers, please, son... ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        while (num1 >= num2) {
            System.out.println("The second should be bigger, moron!");
            System.out.println("Two numbers, please, son... ");
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
        }

        for (int i = num1; num1 <= num2; num1++) {
                System.out.println(num1);
            }
        }

    }

