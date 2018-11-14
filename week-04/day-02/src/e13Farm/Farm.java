package e13Farm;

import java.util.ArrayList;
import java.util.List;

/*
Create a Farm class
        it has list of Animals
        it has slots which defines the number of free places for animals
        breed() -> creates a new animal if there's place for it
        slaughter() -> removes the least hungry animal
*/
public class Farm {
    List<Animal> animalList;
    int freeplaces;

    public Farm() {
        this.animalList = new ArrayList<>();
        this.freeplaces = 5;
    }

    public void breed() {
        if (animalList.size() < freeplaces) {
           animalList.add(new Animal());
        } else System.out.println("No place for a new animal");
    }

    public void slaughter() {
        Animal toSlaughter = animalList.get(0);
        for (int i = 0; i < animalList.size() ; i++) {
            for (int j = 0; j < animalList.size(); j++) {
                if (animalList.get(i).hunger < animalList.get(j).hunger) {
                    toSlaughter = animalList.get(i);
                }
            }

        }
        animalList.remove(toSlaughter);
        freeplaces--;



    }

}
