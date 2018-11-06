import java.util.Scanner;
public class e13Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the expression (first - operation, second, thord / operands");
        String operation = scanner.nextLine();
        double operand1 = scanner.nextDouble();
        double operand2 = scanner.nextDouble();
        System.out.println("The result is: " + calculate(operation, operand1, operand2));

    }
    public static double calculate(String operate, double op1, double op2){
        double result = 0;
        if (operate.equals("+")) {
            result = op1 + op2;
        } else if (operate.equals("-")) {
            result = op1 - op2;
        } else if (operate.equals("*")) {
            result = op1 * op2;
        } else if (operate.equals("/")) {
            result = op1 / op2;
        }
        return result;
    }
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations,
        // create a method named "calculate()":
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit


}
