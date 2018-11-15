public class e05Bunnies {
    // We have a number of bunnies and each bunny has two big floppy ears.
    // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

    public static void main(String[] args) {
        System.out.println(bunnies(10));
    }

    public static int bunnies(int n) {
        if (n == 1) {
            return 2;
        } else {
            return 2 + bunnies(n-1);
        }
    }
}
