import java.util.Arrays;
import java.util.Scanner;
public class e24SortThatList {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubble(new int[]{34, 12, 24, 9, 5})));
//        boolean trueOrFalse = false;
        System.out.println(Arrays.toString(advancedBubble(new int[]{34, 12, 24, 9, 5}, true)));
    }

    public static int[] bubble(int[] a) {
        int counter = 0;
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            counter = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    counter++;
                }
            }
            b[(b.length - 1) - counter] = a[i];
        }

        return b;
    }


    public static int[] advancedBubble(int[] a, boolean descending) {

        int counter = 0;
        int[] b = new int[a.length];
        if (descending) {
            for (int i = 0; i < a.length; i++) {
                counter = 0;
                for (int j = 0; j < a.length; j++) {
                    if (a[i] > a[j]) {
                        counter++;
                    }
                }
                b[(b.length - 1) - counter] = a[i];
            }

            } else return bubble(a);


        return b;

    }
}
