import javax.swing.*;

import java.awt.*;

import static java.lang.Math.sqrt;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class e13SuperDuperHexagon {
    private static void mainDraw(Graphics graphics) {
        superDuperHexagon(graphics, WIDTH/3, 0,0);
//        width/3 n3m oke, atnezni

    }

    public static void superDuperHexagon(Graphics g, int w, int x, int y) {
        int[] xpoints =
        int[] ypoints =
        int npoints = 6;
        g.drawPolygon(xpoints, ypoints, npoints);

        if (w < 2) {
            return;
        } else {
            int[] xpoints1 =
            int[] ypoints1 =

            int[] xpoints2 =
            int[] ypoints2 =

            int[] xpoints3 =
            int[] ypoints3 =

            int npoints = 6;
            g.drawPolygon(xpoints1, ypoints1, npoints);
            superDuperHexagon(g, w,x,y); //valtozokat meghatarozni
            g.drawPolygon(xpoints2, ypoints2, npoints);
            superDuperHexagon(g, w,x,y); //valtozokat meghatarozni
            g.drawPolygon(xpoints3, ypoints3, npoints);
            superDuperHexagon(g, w,x,y); //valtozokat meghatarozni
        }


    }

    // Don't touch the code below
    static int WIDTH = 666;
    static int HEIGHT = 666;

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
