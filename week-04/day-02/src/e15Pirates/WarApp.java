package e15Pirates;

public class WarApp {
    public static void main(String[] args) {
//Creating an armada of 5 ships with crew on each side
         Armada red = new Armada("Red");
         Armada black = new Armada("Black");

        for (int i = 0; i < 5; i++) {
            red.armada.add(new Ship("Red" + i));
            red.armada.get(i).fillShip();
            black.armada.add(new Ship("Black" + i));
            black.armada.get(i).fillShip();
        }

        red.war(black);

    }
}
