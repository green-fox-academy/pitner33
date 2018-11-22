import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class e03EnvelopeStar {
    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.GREEN);
        int offset = 10;
        for (int i = 0; i <= 15; i++) {
            int x = (0 + offset) + (i * (((WIDTH / 2) - offset) / 15));
            int y = (HEIGHT / 2) - (i * (((HEIGHT / 2) - offset) / 15));

            int xx = (WIDTH-offset) - (i * (((WIDTH / 2) - offset) / 15));
            int yy = (HEIGHT / 2) + (i * (((HEIGHT / 2) - offset) / 15));

            graphics.drawLine(x, HEIGHT / 2, WIDTH / 2, y);
            graphics.drawLine(x, HEIGHT / 2, WIDTH / 2, yy);
            graphics.drawLine(xx, HEIGHT / 2, WIDTH / 2, y);
            graphics.drawLine(xx, HEIGHT / 2, WIDTH / 2, yy);
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
