import java.util.Scanner;
public class e04Summing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What a beautiful day. Gimme a number, weasel! ");;
        int number = scanner.nextInt();
        System.out.println("The sum of the numbers until " + number + " is: " + sum(number));



    }
    public static int sum(int nm) {
        int sum1 = 0;
        for (int i = 1; i <= nm; i++) {
            sum1 = sum1 + i;
        }
        return sum1;
    }
}
