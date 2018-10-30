public class e20Unique {
    public static void main(String[] args) {
        int[] numbrList = {1, 11, 34, 11, 52, 61, 1, 34};

        int count = 0;
        for (int j = 0; j < numbrList.length; j++) {
            for (int k = 0; k < numbrList.length; k++) {
                if ((numbrList[j] == numbrList[k]) && (j != k) && (j > k)) {
                    count++;
                }
            }
        }

        int[] temp = new int[numbrList.length - count];

        for (int l = 0; l < temp.length; l++) {
            for (int m = 0; m < numbrList.length; m++) {
                if (l == m) {
                    temp[m] = numbrList[l];
                } else
            }
        }

        for (int n = 0; n < temp.length; n++) {
            System.out.print(temp[n] + " ");
        }

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

    }
}
