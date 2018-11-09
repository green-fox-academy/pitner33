import javax.swing.*;

import java.awt.*;

import static java.lang.Math.sqrt;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class e04Triangles {
    public static void mainDraw(Graphics graphics) {
        int baseline = 400;
        int m = (int)((sqrt(3)*(WIDTH/21))/2);
        int offsetX = (WIDTH/21)/2;
        for (int i = 0; i < 21 ; i++) {
            for (int j = 1; j <= 21-i; j++) {
                int xpoints[] = {(((j-1)*(WIDTH/21))+(i*offsetX)), ((j*(WIDTH/21))+(i*offsetX)), ((((j-1)*WIDTH/21)+((WIDTH/21)/2))+(i*offsetX))};
                int ypoints[] = {((baseline)-(m*i)), ((baseline)-(m*i)), ((baseline - m)-(m*i))};
                int npoints = 3;

                graphics.drawPolygon(xpoints, ypoints, npoints);
            }
        }
    }

    // Don't touch the code below
    static int WIDTH = 420;
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
