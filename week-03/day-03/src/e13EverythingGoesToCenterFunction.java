import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class e13EverythingGoesToCenterFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.
        //FOR GOD'S SAKE - these two things are meaningless together! Give 2 parameters, draw a line and AFTER draw
        //a 100 others regardeless the parameter? Whyyyyy? :)

        //OK, try this: the function will have an x and y starting point, and from ther it will go until the frame with steps of 5
        //and then go around to the starting point - I cannot do this part :( In fact I could, but it is so much if statements...
        int x = (int)(Math.random() * (320+1));
        int y = (int)(Math.random() * (320+1));

        toTheCenter(graphics, x, y);
    }

    private static void toTheCenter(Graphics graphics, int x, int y) {
        int x1 = x;
        int y1 = y;
        if ((x <= 160) && (y <= 160)) {
            while ((x<=320) && (y>=0)) {
                graphics.drawLine(x ,y, 160, 160);
                x +=5;
                y -=5;
            }
        } else if ((x > 160) && (y <= 160)) {
            while ((x<=320) && (y<=320)) {
                graphics.drawLine(x ,y, 160, 160);
                x +=5;
                y +=5;
            }
        } else if ((x > 160) && (y > 160)) {
            while ((x>=0) && (y<=320)) {
                graphics.drawLine(x ,y, 160, 160);
                x -=5;
                y +=5;
            }
        } else if ((x <= 160) && (y > 160)) {
            while ((x>=0) && (y>=0)) {
                graphics.drawLine(x ,y, 160, 160);
                x -=5;
                y -=5;
            }
        }

        if ((x1 <= 160) && (y1 <= 160)) {


        } else if ((x > 160) && (y <= 160)) {


        } else if ((x > 160) && (y > 160)) {


        } else if ((x <= 160) && (y > 160)) {


        }
}



  /*      for (int i = 0; i < 320; i += 20) {
        graphics.drawLine(i, 0, 160, 160);
        graphics.drawLine(0, i, 160, 160);
        graphics.drawLine(i, 320, 160, 160);
        graphics.drawLine(320, i, 160, 160);
    }*/


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
