import java.util.Arrays;

public class e20Unique {
    public static void main(String[] args) {

        System.out.println(unique(new int[]{1, 11, 34, 11, 52, 61, 1, 34}));

//        int[] array = {1, 11, 34, 11, 52, 61,1, 34};
//        System.out.println(unique(array));


    }

    public static String unique(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
        }

        int[] newArray = new int[array.length - count];

        int m = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= m; j++) {
                //ide jon hogz ha nem ugyanaz a ket elem, akkor irja be a newba es novelje meg ay m-et
                if (notContain(newArray, array[i], m)) {
                    newArray[m] = array[i];
                    m++;
                }
            }
        }
        return Arrays.toString(newArray);
    }

    public static boolean notContain(int[] array, int nr, int m) {
        boolean notInIt = true;
        for (int i = 0; i < m; i++) {
            if (array[i] == nr) {
                notInIt = false;
            }
        }
        return notInIt;
    }
}






        /*int[] numbrList = {1, 11, 34, 11, 52, 61, 1, 34};

        int count = 0;
        for (int j = 0; j < numbrList.length; j++) {
            for (int k = 0; k < numbrList.length; k++) {
                if ((numbrList[j] == numbrList[k]) && (j != k) && (j > k)) {
                    count++;
                }
            }
        }

        int[] temp = new int[numbrList.length - count];

        for (int i1 = 0; i1 < numbrList.length; i1++) {
            for (int i2 = 0; i2 < temp.length; i2++) {
                boolean init = (numbrList[i1] == temp[i2]);
            }
        }

        public static boolean itContains (int[] array, int b, int m) { // has 3 parameters - an array, an element, m - index number
            boolean contains = false;                                  // first we set the boolean false

            for (int i = 0; i <m; i++) {                                //we are iterating through the array BUT always until the given m index - we don't check the whole array
                // ie. in array[1, 6, 2, 13, 0, 0 , 0] we are iterating until the [3] index (value 13) so that we can handle 0 value - if 0 isn't between 1 and 13 , then we can add to it in later steps
                if (array[i] == b) {                                    //if the number equals to an array element, we set the boolean true
                    contains = true;
                }
            }
            return contains;                                            // returning the boolean value - it is true when contains, false when not containing

        }
*/
 /*       for (int l = 0; l < temp.length; l++) {
            for (int m = 0; m < numbrList.length; m++) {
                if (l == m) {
                    temp[m] = numbrList[l];
                } else
            }
        }*/

   /*     for (int n = 0; n < temp.length; n++) {
            System.out.print(temp[n] + " ");
        }*/

// booleannal megvizsgálni, hogy az adott elem benne van-e az új tömbben
        // ha nem, beírni az adott helyre - helyet léptetni egyel


  /*      for (int i = 0; i < numbrList.length; i++) {
            temp[i] = numbrList[i];
            System.out.println(temp[i] + " ");
        }*/

     /*   for (int i = 0; i < numbrList.length; i++) {
            int[] temp;
            temp[i] = numbrList[i];

            for (int j = 0; j < numbrList.length; j++) {

                if (numbrList[i] != numbrList[j]) {
                    temp[j] = numbrList[j];
                }
            }
        }*/



