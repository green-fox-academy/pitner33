import java.util.ArrayList;
import java.util.Arrays;

public class e16FindPartOfAnInteger {
    public static void main(String[] args) {
        //  Create a function that takes a number and a list of numbers as a parameter
        //  Returns the indeces of the numbers in the list where the first number is part of
        //  Returns an empty list if the number is not part any of the numbers in the list

        //  Example:
        System.out.println(subInt(1, new int[]{1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
        System.out.println(subInt(9, new int[]{1, 11, 34, 52, 61}));
        //  should print: '[]'
    }

    public static ArrayList<Integer> subInt(int a, int[] newint) {
        String numberToFind = String.valueOf(a);
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < newint.length; i++) {
            String numbers = String.valueOf(newint[i]);
            if (numbers.contains(numberToFind)) {
                result.add(i);
            }
        }
        return result;
    }
}



