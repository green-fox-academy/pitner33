package e15Pirates;

import java.util.ArrayList;
import java.util.List;
/*Create an Armada class
        Contains Ship-s as a list
        Have a armada.war(otherArmada) method where two armada can engage in war
        it should work like merge sort
        first ship from the first armada battles the first of the other
        the loser gets skipped so the next ship comes in play from that armada
        whichever armada gets to the end of its ships loses the war
        return true if this is the winner*/

public class Armada {
    String nameOfArmada;
    List<Ship> armada;

    public Armada(String nameOfArmada) {
        this.nameOfArmada = nameOfArmada;
        this.armada = new ArrayList<>();
    }

    public boolean war(Armada otherArmada) {
        int i = 0;
        int j = 0;
        while ((armada.size() > 0) && (otherArmada.armada.size() > 0)) {
            if (armada.get(i).battle(otherArmada.armada.get(j))) {
                otherArmada.armada.remove(j);

            } else armada.remove(i);

        }
        if (armada.size() == 0) {
            System.out.println(otherArmada.nameOfArmada + " won over " + nameOfArmada);
            return false;
        } else {
            System.out.println(nameOfArmada + " won over " + otherArmada.nameOfArmada);
            return true;
        }

    }

}
