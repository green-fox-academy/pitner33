import java.util.Scanner;
public class e20ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gimme a number. I'll tell you if it was an Armstrong number... \n('cause I'm smart) :) ");
        int num = scanner.nextInt();

        String numString = Integer.toString(num);
        double numValueAt = 0;
        double sum = 0;
        Character numChar = 0;

//        take num, and convert its digits one by one to characters
//        then get the value of the individual character,
//        one by one power the value on the 3, 4, 5th according to the number of digits, and sum them
        for (int i = 0; i < numString.length(); i++) {
            numChar = numString.charAt(i);
            numValueAt = (double) (numChar - '0');
            sum += Math.pow(numValueAt, numString.length());
        }

        if (num == sum) {
            System.out.println("Yep. That's an Armstrong number.");
        } else System.out.println("Nope, sorry. That's not an Armstrong number.");
        System.out.println(sum);
    }
 /*   An Armstrong number is an n-digit number that is equal to the sum of the nth powers of its digits.

            Let's demonstrate this for a 4-digit number: 1634 is a 4-digit number, raise each digit to the fourth power, and add: 1^4 + 6^4 + 3^4 + 4^4 = 1634, so it is an Armstrong number.
    For a 3-digit number: 153 is a 3-digit number, raise each digit to the third power, and add: 1^3 + 5^3 + 3^3 = 153, so it is an Armstrong number.*/
}
