import java.util.Scanner;
public class excersise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the distance in km: ");
        int km = scanner.nextInt();
        System.out.println("The entered distance equals " + km * 1.609344 + " miles" );


    }
}
