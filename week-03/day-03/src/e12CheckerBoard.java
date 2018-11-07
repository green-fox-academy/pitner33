import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class e12CheckerBoard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        int size = 10;
        for (int i = 0; i < 32; i++) {
            for (int j = 0; j < 32; j++) {
               if ((i % 2 == 0) && (j % 2 == 0)) {
                   graphics.drawRect(j*10, i*10, size, size);
               } else if ((i % 2 == 0) && (j % 2 != 0)) {
                   graphics.fillRect(j*10, i*10, size, size);
               } else if ((i % 2 != 0) && (j % 2 == 0)) {
                   graphics.fillRect(j*10, i*10, size, size);
               } else graphics.drawRect(j*10, i*10, size, size);
            }
        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

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
