package e02TheGardenApplication;

import java.util.ArrayList;
import java.util.List;

//The Garden
//        is able to hold unlimited amount of flowers or trees
//        when watering it should only water those what needs water with equally divided amount amongst them
//        eg. watering with 40 and 4 of them need water then each gets watered with 10
public class Garden {
    private List<Plant> plantList;

    public Garden() {
        this.plantList = new ArrayList<>();
    }

    public void addPlant(Plant plant) {
        plantList.add(plant);
    }

    public void wateringGarden(double water) {
        System.out.println("Watering with " + water);
        int thirstyPlant = 0;
        for (int i = 0; i < plantList.size(); i++) {
            if (plantList.get(i).isThirsty()) {
                thirstyPlant++;
            }
        }
        water /= (thirstyPlant);

        for (int i = 0; i < plantList.size(); i++) {
            if (plantList.get(i).isThirsty()) {
                plantList.get(i).waterPlants(water);
            }
        }
        gardenStatus();
    }

    public void gardenStatus() {
            for (int i = 0; i < plantList.size(); i++) {
                System.out.println("The " + plantList.get(i).getColor() + " "
                        + plantList.get(i).getType()
                        + (plantList.get(i).isThirsty() ? " needs water." : " doesn't need water."));;
            }
        System.out.println("");
    }
}
