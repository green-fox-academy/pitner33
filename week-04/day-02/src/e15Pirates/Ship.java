package e15Pirates;

import java.util.ArrayList;
import java.util.List;

/*Create a Ship class.
        The Ship stores Pirate-s instances in a list as the crew and has one captain who is also a Pirate.
        When a ship is created it doesn't have a crew or a captain.
        The ship can be filled with pirates and a captain via fillShip() method.
        Filling the ship with a captain and random number of pirates.
        Ships should be represented in a nice way on command line including information about
        captains consumed rum, state (passed out / died)
        number of alive pirates in the crew
        Ships should have a method to battle other ships: ship.battle(otherShip)
        should return true if the actual ship (this) wins
        the ship should win if its calculated score is higher
        calculate score: Number of Alive pirates in the crew - Number of consumed rum by the captain
        The loser crew has a random number of losses (deaths).
        The winner captain and crew has a party, including a random number of rum :)*/

//It is working, but... later I will create methods for the smaller processes

public class Ship {
    String shipname;
    List<Pirate> ship;

    public Ship(String shipname) {
        this.shipname = shipname;
        this.ship = new ArrayList<>();
    }

    public void fillShip() {
        int randomDrunk = (int)(Math.random() * (4 +1));
        boolean randomSleep = false;
        ship.add(new Pirate("Captain", true, randomDrunk, false));
        int crew = (int)(Math.random() * (25 +1));
        int countDrunkLevel0 = 0;
        int countDrunkLevel1 = 0;
        int countDrunkLevel2 = 0;
        int countDrunkLevel3 = 0;
        int countDrunkLevel4 = 0;

        for (int i = 1; i < crew+1 ; i++) {
            String name = ("Pirate " + i);
            randomDrunk = (int)(Math.random() * (4 +1));
            int randomSleepNum = (int)(Math.random() * (100+1));
            if (randomSleepNum < 50) {
                randomSleep = true;
            }
            ship.add(new Pirate(name, false, randomDrunk, randomSleep));
        }
        System.out.println("Now, the " + shipname + " has a Captain and a crew of " + crew + " pirates");
        System.out.println("The Captain consumed " + ship.get(0).drunkLevel + " bottles of rum.");
        for (int i = 0; i < crew ; i++) {
            if (ship.get(i).drunkLevel == 0) {
                countDrunkLevel0++;
            } else if (ship.get(i).drunkLevel == 1) {
                countDrunkLevel1++;
            } else if (ship.get(i).drunkLevel == 2) {
                countDrunkLevel2++;
            } else if (ship.get(i).drunkLevel == 3) {
                countDrunkLevel3++;
            } else if (ship.get(i).drunkLevel == 4) {
                countDrunkLevel4++;
            }
        }
        System.out.println("From the crew\n" + countDrunkLevel0 + " pirates is sober,\n" + countDrunkLevel1 + " pirates has drank 1 bottle of rum,\n" + countDrunkLevel2 + " pirates has drank 2 bottles of rum,\n" + countDrunkLevel3 + " pirates has drank 3 bottles of rum,\n" + countDrunkLevel4 + " pirates has drank 4 bottles of rum,\n");
    }

    public boolean battle(Ship otherShip) {
//        calculate score: Number of Alive pirates in the crew - Number of consumed rum by the captain
        int countAliveShip = 0;
        int countAliveOtherShip = 0;
        for (int i = 0; i < ship.size(); i++) {
            if (ship.get(i).alive) {
                countAliveShip++;
            }
        }
        for (int i = 0; i < otherShip.ship.size(); i++) {
            if (otherShip.ship.get(i).alive) {
                countAliveOtherShip++;
            }
        }
        int scoreShip = countAliveShip - ship.get(0).drunkLevel;
        int scoreOtherShip = countAliveOtherShip - otherShip.ship.get(0).drunkLevel;

//        The loser crew has a random number of losses (deaths).

        if (scoreShip > scoreOtherShip) {
            int randomDieNum;
            int dieCount = 0;
            for (int i = 1; i < otherShip.ship.size()-1 ; i++) {
                randomDieNum = (int)(Math.random() * (100+1));
                if ((randomDieNum < 50) && (otherShip.ship.get(i).alive)) {
                    otherShip.ship.get(i).alive = false;
                    dieCount++;
                }
            }
            System.out.println("The " + shipname + " won. " + dieCount + " pirates died on the " + otherShip.shipname + ".");

//            The winner captain and crew has a party, including a random number of rum
            int rumCounter = 0;
            for (int i = 0; i < ship.size(); i++) {
                int randomRum = (int)(Math.random() * 4);
                rumCounter += randomRum;
                ship.get(i).drunkLevel += randomRum;
            }
            System.out.println("The " + shipname + " has a party. The pirates drink " + rumCounter + " bottles of rum altogether");
        }
        if (scoreShip < scoreOtherShip) {
            int randomDieNum;
            int dieCount = 0;
            for (int i = 1; i < ship.size()-1 ; i++) {
                randomDieNum = (int)(Math.random() * (100+1));
                if ((randomDieNum < 50) && (ship.get(i).alive)) {
                    ship.get(i).alive = false;
                    dieCount++;
                }
            }
            System.out.println("The " + otherShip.shipname + " won. " + dieCount + " pirates died on the " + shipname + ".");

//            The winner captain and crew has a party, including a random number of rum
            int rumCounter = 0;
            for (int i = 0; i < otherShip.ship.size(); i++) {
                int randomRum = (int)(Math.random() * 4);
                rumCounter += randomRum;
                otherShip.ship.get(i).drunkLevel += randomRum;
            }
            System.out.println("The " + otherShip.shipname + " has a party. The pirates drink " + rumCounter + " bottles of rum altogether");
        }

        return scoreShip > scoreOtherShip;
    }
}
