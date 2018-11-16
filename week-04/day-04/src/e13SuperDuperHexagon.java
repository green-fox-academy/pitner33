import javax.swing.*;

import java.awt.*;

import static java.lang.Math.sqrt;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class e13SuperDuperHexagon {
    private static void mainDraw(Graphics graphics) {
        superDuperHexagon(graphics, WIDTH/2, 0,0);
    }

    public static void superDuperHexagon(Graphics g, int w, int x, int y) {
        int m = (int)(w * sqrt(3) / 2);

        int osX2 = w/4 + w/8; //nr2 hex offset X
        int osY2 = m/2;
        int osX3 = 0; //nr2 hex offset Y
        int osY3 = m;

        if (w < 10) {

            return;
        } else {
            int[] xpoints = {x+w/2, x+3*w/2, x+2*w, x+3*w/2, x+w/2, x};
            int[] ypoints = {y, y, y+m, y+2*m, y+2*m, y+m};
            g.drawPolygon(xpoints, ypoints, 6);

            superDuperHexagon(g, w/2, x+w/4, y);
            superDuperHexagon(g, w/2, x+w/4, y+m);
            superDuperHexagon(g, w/2, x+w, y+m/2);
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
        panel.setBackground(Color.YELLOW);


    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }


    }
}
