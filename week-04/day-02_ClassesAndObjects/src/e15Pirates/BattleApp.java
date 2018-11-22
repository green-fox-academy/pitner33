package e15Pirates;

public class BattleApp {
    public static void main(String[] args) {
         Ship pirates = new Ship("Pirateship");
         Ship merchants = new Ship("Merchantship");

         pirates.fillShip();
         merchants.fillShip();

         pirates.battle(pirates, merchants);

    }
}
