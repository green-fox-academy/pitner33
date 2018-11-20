package e03AircraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
    private List<Aircraft> aircraftList;
    private int storedAmmo;
    private int healthPoints;
    private String name;

    public Carrier(String name, int storedAmmo, int healthPoints) {
        this.name = name;
        this.aircraftList = new ArrayList<>();
        this.storedAmmo = storedAmmo;
        this.healthPoints = healthPoints;
    }

    public void addAircraft(Aircraft aircraft) {
        aircraftList.add(aircraft);
    }

    public void fill() {
        if (storedAmmo == 0) {
            System.out.println("Carrier is out of ammo!");

        } else if (ammoNeedForFill() <= storedAmmo) {
            for (int i = 0; i < aircraftList.size(); i++) {
                storedAmmo -= (aircraftList.get(i).getMaxAmmo() - aircraftList.get(i).getAmmo());
                aircraftList.get(i).setAmmo(aircraftList.get(i).getMaxAmmo());
            }
        } else {
            for (int i = 0; i < aircraftList.size(); i++) {
                if (aircraftList.get(i).isPriority()) {
                    storedAmmo -= (aircraftList.get(i).getMaxAmmo() - aircraftList.get(i).getAmmo());
                    aircraftList.get(i).setAmmo(aircraftList.get(i).getMaxAmmo());
                }
            }
            for (int i = 0; i < aircraftList.size(); i++) {
                storedAmmo -= (aircraftList.get(i).getMaxAmmo() - aircraftList.get(i).getAmmo());
                aircraftList.get(i).setAmmo(aircraftList.get(i).getMaxAmmo());
            }
        }
    }

    public int ammoNeedForFill() {
        int ammoNeed = 0;
        for (int i = 0; i < aircraftList.size(); i++) {
            ammoNeed += (aircraftList.get(i).getMaxAmmo() - aircraftList.get(i).getAmmo());
        }
        return ammoNeed;
    }

    public void fight(Carrier otherCarrier) {
        otherCarrier.healthPoints -= totalDamage();
    }

    public int totalDamage() {
        int allDmgCarrier = 0;
        for (int i = 0; i < aircraftList.size(); i++) {
            allDmgCarrier += aircraftList.get(i).getAmmo() * aircraftList.get(i).getBaseDmg();
        }
        return allDmgCarrier;
    }

    public String getStatusCarrier(Carrier carrier) {
        if (isDead()) {
            return name + ": It's dead, Jim";
        } else {
            String status = "Carrier: " + name + " HP: " + carrier.healthPoints + ", Aircraft count: " + aircraftList.size() + ", Ammo Storage: " + carrier.storedAmmo + ", Total Damage: " + totalDamage() +
                    "\n Aircrafts:\n";
            for (int i = 0; i < aircraftList.size(); i++) {
                status += aircraftList.get(i).getStatus() + "\n";
            }
            return status;
        }
    }
    public boolean isDead() {
        return healthPoints <= 0;
    }


}
