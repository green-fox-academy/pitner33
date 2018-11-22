import java.util.ArrayList;
import java.util.Arrays;

public class e11IsInList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        checkNums(list);
        // Check if list contains all of the following elements: 4,8,12,16
        // Create a method that accepts list as an input
        // it should return "true" if it contains all, otherwise "false"

    }
    public static void checkNums(ArrayList<Integer> a) {
        if ((a.contains(new Integer(4))) && (a.contains(new Integer(8))) && (a.contains(new Integer(12))) && (a.contains(new Integer(16)))) {
            System.out.println("true");
        } else System.out.println("false");

    }
}


