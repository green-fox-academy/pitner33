package e09CowsAndBulls;

import java.util.Scanner;
public class CowsAndBulls {
    int randomNumber;
    String gameState;
    int numberOfGuesses;

    public CowsAndBulls() {
        this.randomNumber = (int)(Math.random() * (10000 - 1000)) + 1000;
        this.gameState = "Playing";
        this.numberOfGuesses = 0;
    }

    public void header() {
        System.out.println("COWS AND BULLS\n================================\nI am thinking of a 4 digit number...\nGuess what is it.");
    }

    public String numberToString(int number) {
        return Integer.toString(number);
    }

    public  void guessing() {
        int bull = 0;
        int cow = 0;
        String randomNumberToString = numberToString(randomNumber);
//        System.out.println(randomNumberToString);
        String guessToString = numberToString(newGuess());
        while (!randomNumberToString.equals(guessToString)) {
            numberOfGuesses++;
            for (int i = 0; i < randomNumberToString.length(); i++) {
                if (randomNumberToString.charAt(i) == guessToString.charAt(i)) {
                    bull++;
                } else if ((randomNumberToString.charAt(i) != guessToString.charAt(i)) && (randomNumberToString.contains(Character.toString(guessToString.charAt(i))))) {
                    cow++;
                }
            }
            System.out.println(numberOfGuesses + ":\t Your guess is " + guessToString + "\t- You have " + bull + " bulls, and " + cow + " cows.");
            bull = 0;
            cow = 0;
            guessToString = numberToString(newGuess());
        }
        System.out.println("Congrats! You've found out the number in " + (numberOfGuesses + 1) + " attempts.");
        this.gameState = "finished";
    }

    public int newGuess() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public String getGameState() {
        return gameState;
    }

    public int getNumberOfGuesses() {
        return numberOfGuesses;
    }
}
