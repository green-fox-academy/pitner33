package e02Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));

        Collections.sort(dominoes);



        System.out.println(dominoes);

        Fleet fleet = new Fleet();
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch
        Thing one = new Thing("Get milk");
        fleet.add(one);

        Thing two = new Thing("Remove the obstacles");
        fleet.add(two);

        Thing three = new Thing("Stand up");
        three.complete();
        fleet.add(three);

        Thing four = new Thing("Eat lunch");
//        four.complete();
        fleet.add(four);

        Thing five = new Thing("Listen munch");
        five.complete();
        fleet.add(five);


        System.out.println(fleet);
        Collections.sort(fleet.getThings());
        System.out.println(fleet);
    }
}
