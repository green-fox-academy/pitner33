import javax.swing.*;

import java.awt.*;

import java.util.ArrayList;

import java.util.HashMap;

import java.util.Map;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class e14ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 1 parameter:
        // An array of {x, y} points
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}
        ArrayList<Map<String, Integer>> coordinates = new ArrayList<Map<String, Integer>>();
        Map<String, Integer> row0 = new HashMap<String, Integer>();
        row0.put("x", 10);
        row0.put("y", 10);
        coordinates.add( row0 );

        Map<String, Integer> row1 = new HashMap<String, Integer>();
        row1.put("x", 290);
        row1.put("y", 10);
        coordinates.add( row1 );

        Map<String, Integer> row2 = new HashMap<String, Integer>();
        row2.put("x", 290);
        row2.put("y", 290);
        coordinates.add( row2 );

        Map<String, Integer> row3 = new HashMap<String, Integer>();
        row3.put("x", 10);
        row3.put("y", 290);
        coordinates.add( row3 );

        connectTheDots(graphics, coordinates);

        ArrayList<Map<String, Integer>> lotOfDots = new ArrayList<Map<String, Integer>>();
        Map<String, Integer> dot0 = new HashMap<String, Integer>();
        dot0.put("x", 50);
        dot0.put("y", 100);
        lotOfDots.add( dot0 );

        Map<String, Integer> dot1 = new HashMap<String, Integer>();
        dot1.put("x", 70);
        dot1.put("y", 70);
        lotOfDots.add( dot1 );

        Map<String, Integer> dot2 = new HashMap<String, Integer>();
        dot2.put("x", 80);
        dot2.put("y", 90);
        lotOfDots.add( dot2 );

        Map<String, Integer> dot3 = new HashMap<String, Integer>();
        dot3.put("x", 90);
        dot3.put("y", 90);
        lotOfDots.add( dot3 );

        Map<String, Integer> dot4 = new HashMap<String, Integer>();
        dot4.put("x", 100);
        dot4.put("y", 70);
        lotOfDots.add( dot4 );

        Map<String, Integer> dot5 = new HashMap<String, Integer>();
        dot5.put("x", 120);
        dot5.put("y", 100);
        lotOfDots.add( dot5 );

        Map<String, Integer> dot6 = new HashMap<String, Integer>();
        dot6.put("x", 85);
        dot6.put("y", 130);
        lotOfDots.add( dot6 );

        Map<String, Integer> dot7 = new HashMap<String, Integer>();
        dot7.put("x", 50);
        dot7.put("y", 100);
        lotOfDots.add( dot7 );

        connectTheDots(graphics, lotOfDots);



    }
    public static void connectTheDots(Graphics g, ArrayList<Map<String, Integer>> al) {
        int[] xpoints = new int[al.size()];
        int[] ypoints = new int[al.size()];
        int npoints = al.size();

        for (int i = 0; i < al.size() ; i++) {
            xpoints[i] = (int)(al.get(i).get("x"));
            ypoints[i] = (int)(al.get(i).get("y"));
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
