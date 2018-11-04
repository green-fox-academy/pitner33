import java.util.Scanner;
import java.util.SortedMap;

public class e31DrawASqare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What? A Sqare? Eh. OK, gimme a number... ");
        int num = scanner.nextInt();

        square(num);
    }

    public static void square(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if ((i == 0) || (i == a-1) || (j == 0) || (j == a-1)) {
                    System.out.print("%");
                } else System.out.print(" ");

            }
            System.out.println(" ");
        }
    }
}
