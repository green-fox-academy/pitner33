import java.util.ArrayList;
import java.util.Arrays;

public class e10ElementFinder {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(containsSeven(arrayList));
        // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
        // The output should be: "Noooooo"
        // Do this again with a different solution using different list methods!

    }
    public static String containsSeven(ArrayList<Integer> numList) {
        String contains = "";
        if (numList.contains(new Integer(7))) {
            contains = "Hoorray";
        } else contains = "Noooooo";
        return contains;
    }
}


