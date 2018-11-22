package e12SharpieSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Sharpie nr1 = new Sharpie("Green", 2f);
        Sharpie nr2 = new Sharpie("Gold", 4f);
        Sharpie nr3 = new Sharpie("Orange", 6f);
        Sharpie nr4 = new Sharpie("Black", 3f);
        Sharpie nr5 = new Sharpie("Red", 5f);

        SharpieSet sharpieListObject = new SharpieSet();
        sharpieListObject.sharpieList.add(nr1);
        sharpieListObject.sharpieList.add(nr2);
        sharpieListObject.sharpieList.add(nr3);
        sharpieListObject.sharpieList.add(nr4);
        sharpieListObject.sharpieList.add(nr5);

        System.out.println(sharpieListObject.countUsable());

        for (int i = 0; i < 100; i++) {
            nr2.use();
        }

        System.out.println(sharpieListObject.countUsable());
        sharpieListObject.removeTrash();

        System.out.println(sharpieListObject.sharpieList.toString());

    }
}
