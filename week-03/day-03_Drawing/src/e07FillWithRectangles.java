import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class e07FillWithRectangles {
    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.
        for (int i = 0; i < 4 ; i++) {
            int r = (int)(Math.random() * (255) + 1);
            int g = (int)(Math.random() * (255) + 1);
            int b = (int)(Math.random() * (255) + 1);
            int x = (int)(Math.random() * (300) + 1);
            int y = (int)(Math.random() * (300) + 1);
            int width = (int)(Math.random() * ((300-x) - 10) + 1) + 10;
            int height = (int)(Math.random() * ((300-y) - 10) + 1) + 10;
            double filled = (double)(Math.random());

            graphics.setColor(new Color(r, g, b));
            if (filled <= 0.5) {
                graphics.drawRect(x, y, width, height);
            } else graphics.fillRect(x, y, width, height);
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
