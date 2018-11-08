import javax.swing.*;

import java.awt.*;

import static java.lang.Math.sqrt;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class e04Triangles {
    public static void mainDraw(Graphics graphics) {
        int baseline = 300;
        int m = (int)((sqrt(3)*(WIDTH/21))/2);
        for (int i = 1; i <= 21 ; i++) {
            for (int j = 1; j <= 21; j++) {


            int xpoints[] = {((i-1)*(WIDTH/21)), (i*(WIDTH/21)), (((i-1)*WIDTH/21)+((WIDTH/21)/2))};
            int ypoints[] = {baseline, baseline, (baseline - m)};
            int npoints = 3;

            graphics.drawPolygon(xpoints, ypoints, npoints);
            }
        }


    }

    // Don't touch the code below
    static int WIDTH = 630;
    static int HEIGHT = 700;

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
