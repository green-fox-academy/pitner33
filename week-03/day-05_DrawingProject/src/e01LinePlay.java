import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class e01LinePlay {
    public static void mainDraw(Graphics graphics) {
        int x = 0;
        int y = 0;
        int offset = 10;
        for (int i = 1; i < 14; i++) {
            x = WIDTH/8 + (((7 * WIDTH) / 8)/14)*i;
            y = (((7 * WIDTH) / 8)/14)*i;

            graphics.setColor(Color.MAGENTA);
            graphics.drawLine(x, 0+offset, WIDTH-offset, y );
        }

        for (int i = 1; i < 14; i++) {
            y = WIDTH/8 + (((7 * WIDTH) / 8)/14)*i;
            x = (((7 * WIDTH) / 8)/14)*i;

            graphics.setColor(Color.GREEN);
            graphics.drawLine(0+offset, y, x, WIDTH-offset );
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


    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }
}
