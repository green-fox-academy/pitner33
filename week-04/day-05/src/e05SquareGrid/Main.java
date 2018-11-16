package e05SquareGrid;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void mainDraw(Graphics graphics) {
        squareGrid(graphics, WIDTH/4, WIDTH/4, WIDTH/2, 20);
    }

    public static void squareGrid(Graphics graphics, int x, int y, int width, int height) {
        if (height < 1) {
            return;
        }else {
            FilledFrame grid = new FilledFrame(x, y, width, height);
            grid.drawFilledFrame(graphics);

            squareGrid(graphics, x-width/4, y-width/4, width/2, height/2);
            squareGrid(graphics, x+3*width/4, y-width/4, width/2, height/2);
            squareGrid(graphics, x+3*width/4, y+3*width/4, width/2, height/2);
            squareGrid(graphics, x-width/4, y+3*width/4, width/2, height/2);
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
