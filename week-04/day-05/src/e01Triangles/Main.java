package e01Triangles;

import javax.swing.*;

import java.awt.*;

import static java.awt.image.ImageObserver.WIDTH;
import static java.lang.Math.sqrt;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void mainDraw(Graphics graphics) {
        fractal(graphics, 200,WIDTH/2, 0);
        Triangle frame = new Triangle(400, WIDTH/2, (int)(sqrt(3)*400/2));
        frame.drawReverseTriangle(graphics);

    }

    public static void fractal(Graphics graphics, int side, int x, int y) {
        if (side < 5) {
            return;
        } else {

            Triangle bigTriangle = new Triangle(side, x, y);
            bigTriangle.drawTriangle(graphics);
            fractal(graphics, side/2, x + side/2, y);
            fractal(graphics, side/2, x - side/2, y);
            fractal(graphics, side/2, x, y + (int)(side*sqrt(3)/2));

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
