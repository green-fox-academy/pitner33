public class excersise12 {
    public static void main(String[] args) {
        double a = 10;
        double b = 10;
        double c = 10;

        int surface = (int) (2 * (a * b + a* c + b * c));
        int volume = (int) (a * b * c);
        System.out.println("Surface area: " + surface);
        System.out.println("Volume: " + volume);
}}