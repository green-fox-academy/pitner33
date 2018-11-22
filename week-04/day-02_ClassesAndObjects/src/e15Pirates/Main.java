package e15Pirates;

public class Main {
    public static void main(String[] args) {
        Pirate bill = new Pirate("Bill", true);
        Pirate joe = new Pirate("Joe", false);

        for (int i = 0; i < 4; i++) {
            bill.drinkSomeRum();
        }
        System.out.println(bill.drunkLevel);

        bill.howIsItGoingMate();

        bill.drinkSomeRum();

        bill.howIsItGoingMate();

        bill.drinkSomeRum();

        joe.brawl(bill);

        bill.die();
        bill.drinkSomeRum();
        bill.howIsItGoingMate();

        joe.brawl(bill);
        System.out.println("___________________________________________");

        Ship noon = new Ship("Noon");
        noon.fillShip();

        Ship midnight = new Ship("Midnight");
        midnight.fillShip();

        System.out.println(midnight.battle(midnight, noon));
        midnight.battle(midnight, noon);
    }
}
