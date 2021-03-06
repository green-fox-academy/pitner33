import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class e11PurpleSteps {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps/r3.png]
        int size = 10;
        int x = 0;
        int y = 0;
        for (int i = 1; i < 20; i++) {
            x += 10;
            y += 10;
            graphics.setColor(Color.BLACK);
            graphics.drawRect(x, y, size, size);
            graphics.setColor(new Color(128, 0, 128));
            graphics.fillRect(x, y, size, size);
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
