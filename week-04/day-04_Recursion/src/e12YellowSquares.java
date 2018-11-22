import javax.swing.*;

import java.awt.*;

import static java.lang.Math.sqrt;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class e12YellowSquares {
    private static void mainDraw(Graphics graphics) {

        square(graphics, WIDTH/3,0, 0);
    }

    public static void square(Graphics g, int w, int x, int y) {
        if (w < 2){
            return;
        } else {
            g.drawRect(x, y, w, w);
            g.drawRect(x+w, y, w, w);

            square(g, w/3, x+w, y);

            g.drawRect(x+2*w, y, w, w);
            g.drawRect(x, y+w, w, w);

            square(g, w/3, x, y+w);

            g.drawRect(x+w, y+w, w, w);
            g.drawRect(x+2*w, y+w, w, w);

            square(g, w/3, x+2*w, y+w);

            g.drawRect(x, y+2*w, w, w);
            g.drawRect(x+w, y+2*w, w, w);

            square(g, w/3, x+w, y+2*w);

            g.drawRect(x+2*w, y+2*w, w, w);
        }


    }

    // Don't touch the code below
    static int WIDTH = 666;
    static int HEIGHT = 666;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
        panel.setBackground(Color.YELLOW);


    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }


    }
}
