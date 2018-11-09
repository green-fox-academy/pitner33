import java.util.Scanner;
public class excercise25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gimme a number, bastard! ");
        int number = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(i + " *" + number + " = " + i * number);
        }
    }
}
