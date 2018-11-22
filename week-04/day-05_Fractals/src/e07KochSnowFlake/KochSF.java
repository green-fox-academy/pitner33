package e07KochSnowFlake;

import java.awt.*;

import static java.lang.Math.sqrt;

public class KochSF {
    int steps;
    int startX;
    int endX;
    int startY;
    int endY;


    public KochSF(int steps, int startX, int startY, int endX, int endY) {
        this.steps = steps;
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;

    }

    public void drawKochLine(Graphics graphics) {
        double m = (sqrt(3)/6);
        int dx = endX - startX;
        int dy = endY - startY;

        int x2 = startX + dx/3;
        int x3 = (startX + endX)/2 + (int)(m*(startY - endY));
        int x4 = startX + 2*dx/3;

        int y2 = startY + dy/3;
        int y3 = (startY + endY)/2 + (int)(m*(startX - endX));
        int y4 = startY + 2*dy/3;

        graphics.drawLine(startX, startY, x2, y2);
        graphics.drawLine(x2, y2, x3, y3);
        graphics.drawLine(x3, y3, x4, y4);
        graphics.drawLine(x4, y4, endX, endY);




    }
}
