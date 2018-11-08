import java.util.Scanner;
public class e18GuessMyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the bottom of the range you want to play the guess game in:");
        int min = scanner.nextInt();
        System.out.println("Type the top of the range you want to play the guess game in:");
        int max = scanner.nextInt();
        System.out.println("How many times would you like to try?");
        int lives = scanner.nextInt();

        int numberToFind = (int)(Math.random() * (max - min) + 1) + min;
        System.out.println("Okay. Now I'm thinking of a number between " + min + " and " + max + "\nGuess! You have " + lives + " lives. ");
        int guess = scanner.nextInt();

        while ((numberToFind != guess) && (lives != 0)) {
            lives--;
            if ((numberToFind < guess) && (lives > 1)) {
                    System.out.println("Too high! You have " + lives + " lives left.\nGuess again!");
                    guess = scanner.nextInt();
            } else if ((numberToFind < guess) && (lives == 1)) {
                    System.out.println("Too high! You have " + lives + " life left.\nGuess again!");
                    guess = scanner.nextInt();
            } else if ((numberToFind > guess) && (lives > 1)) {
                    System.out.println("Too low! You have " + lives + " lives left.\nGuess again!");
                    guess = scanner.nextInt();
            } else if ((numberToFind > guess) && (lives == 1)) {
                    System.out.println("Too low! You have " + lives + " life left.\nGuess again!");
                    guess = scanner.nextInt();
            }
        }
        if (numberToFind == guess) {
            System.out.println("Congrats. You won. The number was " + numberToFind);
        } else System.out.println("Well, you have 0 life left - you lost");
    }
}
