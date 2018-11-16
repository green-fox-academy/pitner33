package e04SierpinskysCarpet;
import javax.swing.*;
import java.awt.*;
import static java.awt.image.ImageObserver.WIDTH;
import static java.lang.Math.sqrt;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void mainDraw(Graphics graphics) {
        sierspinsky(graphics, WIDTH/3, WIDTH/3, WIDTH/3);
    }

    public static void sierspinsky(Graphics graphics, int x, int y, int side) {
        if (side < 2) {
            return;
        } else {
            Square carpet = new Square(x, y, side);
            carpet.drawFilledSquare(graphics);

            sierspinsky(graphics, x-2*side/3, y-2*side/3, side/3);
            sierspinsky(graphics, x+side/3, y-2*side/3, side/3);
            sierspinsky(graphics, x+4*side/3, y-2*side/3, side/3);

            sierspinsky(graphics, x-2*side/3, y+side/3, side/3);
            sierspinsky(graphics, x-2*side/3, y+4*side/3, side/3);

            sierspinsky(graphics, x+4*side/3, y+side/3, side/3);
            sierspinsky(graphics, x+4*side/3, y+4*side/3, side/3);

            sierspinsky(graphics, x+side/3, y+4*side/3, side/3);
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
