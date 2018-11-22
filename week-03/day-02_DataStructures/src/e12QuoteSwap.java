import java.util.ArrayList;
import java.util.Arrays;

public class e12QuoteSwap {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().

        // Also, print the sentence to the output with spaces in between.
        System.out.println(quoteSwap(list));
        // Expected output: "What I cannot create I do not understand."

    }
    public static String quoteSwap(ArrayList<String> a) {
        a.add(2, a.get(5));
        a.set(6, a.get(3));
        a.remove(3);
        String quote = "";
        for (int i = 0; i < a.size(); i++) {
            quote = quote + a.get(i) + " ";

        }
        return  quote;
    }
}
