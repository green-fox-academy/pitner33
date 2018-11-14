package e12SharpieSet;

import java.util.ArrayList;
import java.util.List;

/*Reuse your Sharpie class
Create SharpieSet class
        it contains a list of Sharpie
        countUsable() -> sharpie is usable if it has ink in it
        removeTrash() -> removes all unusable sharpies*/
public class SharpieSet {
    List<Sharpie> sharpieList;

    public SharpieSet() {
        this.sharpieList = new ArrayList<>();
    }

    public SharpieSet(List<Sharpie> sharpieList) {
        this.sharpieList = sharpieList;
    }


    public int countUsable() {
        int count = 0;
        for (Sharpie sharpie : this.sharpieList) {
            if (sharpie.getInkAmount() > 0) {
                count++;
            }
        }
        return count;

    }

  /*  public void removeTrash() {
        for (Sharpie sharpie : this.sharpieList) {
            if (sharpie.getInkAmount() == 0) {
                sharpieList.remove(sharpie);
            }
        }
    }*/
 public void removeTrash() {
        for (int i = 0; i < sharpieList.size(); i++) {
            if (sharpieList.get(i).getInkAmount() == 0) {
                sharpieList.remove(sharpieList.get(i));
            }


        }
   }
}
