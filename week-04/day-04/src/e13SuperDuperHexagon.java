import javax.swing.*;

import java.awt.*;

import static java.lang.Math.sqrt;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class e13SuperDuperHexagon {
    private static void mainDraw(Graphics graphics) {
        superDuperHexagon(graphics, WIDTH, 0,0);
//        width/3 n3m oke, atnezni

    }

    public static void superDuperHexagon(Graphics g, int w, int x, int y) {
        int m = (int)(w/2 * sqrt(3) / 2);

        int npoints = 6;
        int osX2 = w/4 + w/8; //nr2 hex offset X
        int osY2 = m/2;
        int osX3 = 0; //nr2 hex offset Y
        int osY3 = m;

        int[] xpoints = {WIDTH/4, (WIDTH/4)+(WIDTH/2), WIDTH, (WIDTH/4)+(WIDTH/2), WIDTH/4, 0};
        int[] ypoints = {0, 0, (int)(WIDTH/2 * sqrt(3) / 2), 2*(int)(WIDTH/2 * sqrt(3) / 2), 2*(int)(WIDTH/2 * sqrt(3) / 2), (int)(WIDTH/2 * sqrt(3) / 2)};
        g.drawPolygon(xpoints, ypoints, npoints);



        if (w < 20) {

            return;
        } else {
            int[] xpoints1 = {x + w/4, x + w/2, x + w/2 + w/8, x + w/2, x + w/4, x + w/8};
            int[] ypoints1 = {y, y, y + m/2, y + m, y + m, y + m/2, y + m/2};

            int[] xpoints2 = {osX2 + x + w/4, osX2 + x + w/2, osX2 + x + w/2 + w/8, osX2 + x + w/2, osX2 + x + w/4, osX2 + x + w/8};
            int[] ypoints2 = {osY2 + y, osY2 + y, osY2 + y + m/2, osY2 + y + m, osY2 + y + m, osY2 + y + m/2, osY2 + y + m/2};

            int[] xpoints3 = {osX3 + x + w/4, osX3 + x + w/2, osX3 + x + w/2 + w/8, osX3 + x + w/2, osX3 + x + w/4, osX3 + x + w/8};
            int[] ypoints3 = {osY3 + y, osY3 + y, osY3 + y + m/2, osY3 + y + m, osY3 + y + m, osY3 + y + m/2, osY3 + y + m/2};


            g.drawPolygon(xpoints1, ypoints1, npoints);
            superDuperHexagon(g, w/2, x + w/8, 0);
            g.drawPolygon(xpoints2, ypoints2, npoints);
            superDuperHexagon(g, w/2, x + w/2, y + m/2);
            g.drawPolygon(xpoints3, ypoints3, npoints);




//            superDuperHexagon(g, w/2, x + w/8, y + m);

        }
    }

    // Don't touch the code below
    static int WIDTH = 500;
    static int HEIGHT = 433;

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
