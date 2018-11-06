import java.util.Scanner;
public class e01Thor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt();
        int lightY = in.nextInt();
        int initialX = in.nextInt();
        int initialY = in.nextInt();

        while ((initialX == lightX) && (initialY <= lightY)) {
            initialY++;
        }
    }


}
