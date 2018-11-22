public class excercise13 {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int remaining = 86400 - 3600 * currentHours - 60 * currentMinutes - currentSeconds;
        System.out.println(remaining);

    }
}
