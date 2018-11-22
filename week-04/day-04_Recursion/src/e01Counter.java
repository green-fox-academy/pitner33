public class e01Counter {
    // Write a recursive function that takes one parameter: n and counts down from n.

    public static void main(String[] args) {
        counter(5);
    }

    public static int counter(int n) {
        System.out.println(n);
        if (n == 0) {
            return n;
        } else {
            return n * counter(n-1);
        }
    }
}
