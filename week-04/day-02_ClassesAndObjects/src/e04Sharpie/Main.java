package e04Sharpie;

public class Main {
    public static void main(String[] args) {
        Sharpie green = new Sharpie("Green", (float)23);

        for (int i = 0; i < 50; i++) {
            green.use();

        }
        System.out.println(green.inkAmount);
    }
}
