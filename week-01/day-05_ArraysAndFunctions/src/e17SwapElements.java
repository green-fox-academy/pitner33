public class e17SwapElements {
    public static void main(String[] args) {
        String[] abc = {"first", "second", "third"};
        String a = abc[0];
        abc[0] = abc[2];
        abc[2] = a;

        for (int i = 0; i < abc.length; i++) {
            System.out.print(abc[i] + " ");
        }
        System.out.println(" ");


    }
}
