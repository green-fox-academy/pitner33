package e08DiceSet;

public class Main {
    public static void main(String[] args) {
        DiceSet sixes = new DiceSet();

        sixes.roll();
        for (int i = 0; i < 6; i++) {
            while (sixes.getCurrent(i) != 6) {
                sixes.reroll(i);
            }
            System.out.println(sixes.getCurrent(i));
        }
    }
}
