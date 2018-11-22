import javax.swing.*;

import java.awt.*;

import static java.lang.Math.sqrt;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class e05SuperHexagon {
    public static void mainDraw(Graphics graphics) {
        int sideLength = 20;
        int baseline = 350;
        int a = (int)((sideLength/2) * sqrt(3)); //y elevation between base and the center of the hex
        int b = sideLength/2; //x offset between the left bottom point and the left-middle point

//        coordinates for the six points, where 1 is the bottom-left one, and it's anti/clockwise
//        also the position of the hex is in the middle and sits on the baseline
        int hexX1 = ((WIDTH/2) - (sideLength/2));
        int hexY1 = baseline;

        int hexX2 = ((WIDTH/2) + (sideLength/2));
        int hexY2 = baseline;

        int hexX3 = ((WIDTH/2) + (sideLength/2) + b);
        int hexY3 = baseline - a;

        int hexX4 = ((WIDTH/2) + (sideLength/2));
        int hexY4 = baseline - 2*a;

        int hexX5 = ((WIDTH/2) - (sideLength/2));
        int hexY5 = baseline - 2*a;

        int hexX6 = ((WIDTH/2) - (sideLength/2) - b);
        int hexY6 = baseline - a;

        int hexElevY = 2 * a; //elevation in the direction Y of the next hex
        int hexOffsetY = a; //offset in the direction Y of the next hex column to the sides
        int hexOffsetX = sideLength + b; //offset in the direction X of the next hex column to the sides


        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j < 7-i; j++) {
                int[] xpoints = {(hexX1 + i*hexOffsetX), (hexX2 + i*hexOffsetX), (hexX3 + i*hexOffsetX), (hexX4 + i*hexOffsetX), (hexX5 + i*hexOffsetX), (hexX6 + i*hexOffsetX)};
                int[] ypoints = {(hexY1 - (j * hexElevY) - (i * hexOffsetY)), (hexY2 - (j * hexElevY) - (i * hexOffsetY)), (hexY3 - (j * hexElevY) - (i * hexOffsetY)), (hexY4 - (j * hexElevY) - (i * hexOffsetY)), (hexY5 - (j * hexElevY) - (i * hexOffsetY)), (hexY6 - (j * hexElevY) - (i * hexOffsetY))};
                int npoints = 6;
                int[] xpointsNeg = {(hexX1 - i*hexOffsetX), (hexX2 - i*hexOffsetX), (hexX3 - i*hexOffsetX), (hexX4 - i*hexOffsetX), (hexX5 - i*hexOffsetX), (hexX6 - i*hexOffsetX)};
                //xpointNeg is for the left half of the whole thing

                graphics.drawPolygon(xpoints, ypoints, npoints);
                graphics.drawPolygon(xpointsNeg, ypoints, npoints);
            }
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
