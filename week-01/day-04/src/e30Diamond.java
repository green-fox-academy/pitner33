import java.util.Scanner;
public class e30Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You again? Meh. Gimme a number. ");
        int num = scanner.nextInt();

        diamond(num);


    }
    public static void diamond(int a) {
        Scanner scanner = new Scanner(System.in);
        while (a % 2 == 0) {
            System.out.println("For a diamond I need an odd number, please... ");
            a = scanner.nextInt();
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if ((j <= (((a/2) + i)) && (j >= ((a/2) - i)) && (i <= (a/2))) || ((j+i < ((a*1.5)-1)) && (j >= (i-(a/2))) && (i > (a/2)))) {
                    System.out.print("*");
                } else System.out.print(" ");

            }
            System.out.println(" ");
        }
    }
}
