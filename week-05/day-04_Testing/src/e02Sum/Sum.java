package e02Sum;

import java.util.ArrayList;
import java.util.List;

public class Sum {


    public static int sum(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
