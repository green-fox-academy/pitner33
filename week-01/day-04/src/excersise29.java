import java.util.Scanner;
public class excersise29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number, please...");
        int num = scanner.nextInt();

        String ch = "*";
        String space = " ";

        for (int i = 0; i < num; i++) {
            for (int k = 0; k < (num - i); k++) {
                System.out.print(space);
            }

            System.out.println(ch);
            ch = ch + "**";
        }
    }
}


