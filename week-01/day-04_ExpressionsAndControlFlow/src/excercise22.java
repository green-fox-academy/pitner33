import java.util.Scanner;
public class excercise22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gimme A");
        double a = scanner.nextInt();

        int out = 0;
        if (a % 2 == 0) {
            System.out.println(out + 1);
        } else {
            System.out.println(out);
        }

        int b = 13;
        String out2 = "";
        if ((b >= 10) && (b <= 20)) {
            out2 = "Sweet!";
        } else if (b < 10) {
            out2 = "More!";
        } else {
            out2 = "Less!";
        }
        System.out.println(out2);


        int c = 123;
        int credits = 100;
        boolean isBonus = false;



    }
}
