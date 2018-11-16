package e03Hexagon;
import javax.swing.*;
import java.awt.*;
import static java.awt.image.ImageObserver.WIDTH;
import static java.lang.Math.sqrt;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void mainDraw(Graphics graphics) {
        fractalHex(graphics, 0, 0, WIDTH/2);
    }

    public static void fractalHex(Graphics graphics, int x, int y, int sideLength) {
        if (sideLength < 2) {
            return;
        } else {
            Hexagon hex = new Hexagon(x,y, sideLength);
            hex.drawHexagon(graphics);

            fractalHex(graphics, x+sideLength/3, y, sideLength/3);
            fractalHex(graphics, x+sideLength, y, sideLength/3);
            fractalHex(graphics, x, (int)(y+ sideLength*sqrt(3)/3), sideLength/3);
            fractalHex(graphics, x+sideLength + sideLength/3, (int)(y+ sideLength*sqrt(3)/3), sideLength/3);
            fractalHex(graphics, x+sideLength/3, y + 2*((int)(sideLength*sqrt(3)/3)), sideLength/3);
            fractalHex(graphics, x+sideLength, y + 2*((int)(sideLength*sqrt(3)/3)), sideLength/3);
        }

    }



    // Don't touch the code below
    static int WIDTH = 500;
    static int HEIGHT = 500;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();


    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }
}
