import java.util.Scanner;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class e02LinePlayQuarters {
    public static void mainDraw(Graphics graphics) {

        int windows = 16;
//        Here is the scanner part which runs two times because of the mainDraw method is called in an other method at the end
//        --according to Levi
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("How many LinePlays would you like? \n1, 4, 16, or 64? ");
        int windows = scanner.nextInt();

        while ((windows != 4) && (windows != 16) && (windows != 64) && (windows != 1 )) {
            System.out.println("Don't play with me, kid! \n1, 4 OR 16 OR 64???");
            windows = scanner.nextInt();
        }*/

        double nr = (double) (Math.pow(windows, 0.5));
        int x = 0;
        int y = 0;
        int offset = 10;
        int windowWidth = (int) (WIDTH / nr);
        int windowOffsetX = 0;
        int windowOffsetY = 0;

        for (int i = 0; i < nr; i++) {
            offset /= nr;
            for (int j = 0; j < nr; j++) {
                windowOffsetX = windowWidth * j;
                windowOffsetY = windowWidth * i;
                graphics.setColor(Color.BLACK);
                graphics.drawRect(windowOffsetX, windowOffsetY, windowWidth, windowWidth);

                for (int k = 1; k <= 14; k++) {
                    x = windowOffsetX + (windowWidth / 8 + (((7 * windowWidth) / 8) / 14) * k);
                    y = windowOffsetY + ((((7 * windowWidth) / 8) / 14) * k);

                    graphics.setColor(Color.MAGENTA);
                    graphics.drawLine(x, 0 + offset + windowOffsetY, windowWidth - offset + windowOffsetX, y);
                }

                for (int l = 1; l <= 14; l++) {
                    y = windowOffsetY + (windowWidth / 8 + (((7 * windowWidth) / 8) / 14) * l);
                    x = windowOffsetX + ((((7 * windowWidth) / 8) / 14) * l);

                    graphics.setColor(Color.GREEN);
                    graphics.drawLine(0 + offset + windowOffsetX, y, x, windowWidth - offset + windowOffsetY);
                }
            }
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
