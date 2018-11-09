import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class e04ToTheCenterFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Draw 3 lines with that function. Use loop for that.

        //just for fun I draw a random number of lines between 3 and 100
        int numOfLines = (int)(Math.random() * (100 - 3) + 1) + 3;
        for (int i = 0; i < numOfLines; i++) {
            int x = (int)(Math.random() * (320) + 1);
            int y = (int)(Math.random() * (320) + 1);
            toTheCenter(graphics, x, y);
        }
    }
    public static void toTheCenter(Graphics g, int x, int y) {
        g.drawLine(x, y,160, 160);

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
