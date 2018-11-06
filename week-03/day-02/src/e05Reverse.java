import java.util.ArrayList;

public class e05Reverse {
    public static void main(String[] args) {
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.


        System.out.println(reverse(reversed));
    }

    public static String reverse(String a) {
        ArrayList<Character> newOne = new ArrayList<>();
        String backwords = "";
        for (int i = a.length() - 1; i >= 0; i--) {
//            newOne.add(a.charAt(i));
            Character newChar = a.charAt(i);
            backwords = backwords + newChar;
        }
        return backwords;

    }

    public static String reverse2(String a) {
        
    }
}

