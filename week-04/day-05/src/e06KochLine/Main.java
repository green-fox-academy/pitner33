package e06KochLine;
import javax.swing.*;
import java.awt.*;
import static java.lang.Math.sqrt;
import static java.lang.Math.toDegrees;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void mainDraw(Graphics graphics) {
        kochLine(graphics, 3, 20, 100, 300, 100);
    }

    public static void kochLine(Graphics graphics, int n, int x1, int y1, int x5, int y5) {
        if (n == 1) {
            KochLine koch = new KochLine(n, x1, y1, x5, y5);
            koch.drawKochLine(graphics);
        } else {
            double m = sqrt(3)/6;
            int dx = x5 - x1;
            int dy = y5 - y1;

            int x2 = x1 + dx/3;
            int x3 = (int)((x1 + x5)/2 + m*(y1 - y5));
            int x4 = x1 + 2*dx/3;

            int y2 = y1 + dy/3;
            int y3 = (int)(((y1 + y5)/2) + (m*(x5 - x1)));
            int y4 = y1 + 2*dy/3;

            kochLine(graphics, n-1, x1, y1, x2, y2);
            kochLine(graphics, n-1, x2, y2, x3, y3);
            kochLine(graphics, n-1, x3, y3, x4, y4);
            kochLine(graphics, n-1, x4, y4, x5, y5);

        }
    }




    // Don't touch the code below
    static int WIDTH = 500;
    static int HEIGHT = 600;

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


