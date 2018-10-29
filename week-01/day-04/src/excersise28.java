import java.util.Scanner;
public class excersise28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number, please...");
        int num = scanner.nextInt();


        String ch = "*";
        for (int i = 0; i < num; i++) {
            System.out.println(ch);
            ch = ch + "*";

            }


        }


    }
