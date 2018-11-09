import javax.swing.*;

import java.awt.*;

import static java.lang.Math.sqrt;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class e04TrianglesFromLines {
    public static void mainDraw(Graphics graphics) {
        int baseline = 400;
        int m = (int)((sqrt(3)*(WIDTH/21))/2);
        int offsetX = (WIDTH/21)/2;
        for (int i = 0; i < 21; i++) {
            graphics.drawLine((offsetX * i), (baseline - (i * m)), (offsetX * i) + ((21-i)* (WIDTH/21)), (baseline - (i * m)));
            graphics.drawLine((WIDTH/21 * i), baseline, ((WIDTH/2) + (offsetX*i)), (baseline - (21-i)*m));
            graphics.drawLine((WIDTH/21 * (21-i)), baseline, ((WIDTH/2) - (offsetX*i)),(baseline - (21-i)*m));
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
