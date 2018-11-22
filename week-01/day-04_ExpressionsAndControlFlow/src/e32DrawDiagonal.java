import java.util.Scanner;
public class e32DrawDiagonal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gimme a number, bastard! ");
        int num = scanner.nextInt();

        drawDiagonal(num);


    }

    public static void drawDiagonal(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if ((i == 0) || (i == a-1)) {
                    System.out.print("%");
                } else if((j == 0) || (j == a-1)) {
                    System.out.print("%");
                } else if (i == j) {
                    System.out.print("%");
                }else System.out.print(" ");
            }
            System.out.println(" ");
        }

    }

}
