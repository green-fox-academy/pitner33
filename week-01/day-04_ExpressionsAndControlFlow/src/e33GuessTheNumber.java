import java.util.Scanner;
public class e33GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = (int)(Math.random() * 100) + 1;
        System.out.println(num);

        System.out.println("Guessing game - yummy. I'm thinking of a number between 1 and 100. Guess what is that...");
        int guess = scanner.nextInt();
        guessTheNumber(num, guess);

    }
    public static void guessTheNumber(int number, int guess) {
        Scanner scanner = new Scanner(System.in);
        while (guess != number) {
            if ( guess < number) {
                System.out.println("I'm thinking something higher. Guess again. ");
                guess = scanner.nextInt();
            } else if (guess > number) {
                System.out.println("I'm thinking something lower. Guess again. ");
                guess = scanner.nextInt();
            }
        }
        System.out.println("Yeah, you found it. It was " + number);
    }
}
