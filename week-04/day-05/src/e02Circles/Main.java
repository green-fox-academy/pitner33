package e02Circles;
import javax.swing.*;
import java.awt.*;
import static java.awt.image.ImageObserver.WIDTH;
import static java.lang.Math.sqrt;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void mainDraw(Graphics graphics) {
        fractal(graphics, 0, 0, WIDTH);

    }

    public static void fractal(Graphics graphics, int x, int y, int diameter) {
        if (diameter < 20) {
            return;
        }else {
            Circle circle = new Circle(x, y, diameter);
            circle.drawCircle(graphics);
            fractal(graphics, x+diameter/4, y, diameter/2);
            fractal(graphics, x + (int)(0.017 *diameter) , y + diameter/3, diameter/2);
            fractal(graphics, x+diameter/2 - (int)(0.017 *diameter), y + diameter/3, diameter/2);
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
