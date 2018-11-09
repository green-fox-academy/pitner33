import java.util.Scanner;
public class excercise21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many boys will come to your lame party, bastard? ");
        int boys = scanner.nextInt();

        System.out.println("And how many girls will come to your lame party, bastard? ");
        int girls = scanner.nextInt();

        if (girls == 0) {
            System.out.println("Sausage party!");
        }else if ((boys == girls) && (boys + girls >= 20)) {
            System.out.println("This will be epic - I'll come too!");
        } else if ((boys != girls) && (boys + girls >= 20)) {
            System.out.println("Quite cool!");
        } else if (boys + girls < 20) {
            System.out.println("Average");
        }

    }
}
