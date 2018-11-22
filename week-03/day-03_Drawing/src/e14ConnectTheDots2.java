import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class e14ConnectTheDots2 {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 1 parameter:
        // An array of {x, y} points
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}
        int[][] box = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};
        int[][] fox = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},{120, 100}, {85, 130}, {50, 100}};

        connectThDots(graphics, box);
        connectThDots(graphics, fox);


    }
    public static void connectThDots(Graphics g, int[][] al) {
        int xpoints[] = new int[al.length];
        int ypoints[] = new int[al.length];
        int npoints = al.length;

        for (int i = 0; i < al.length; i++) {
            xpoints[i] = al[i][0];
            ypoints[i] = al[i][1];
        }
        g.setColor(Color.GREEN);
        g.drawPolygon(xpoints, ypoints, npoints);
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
