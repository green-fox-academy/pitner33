package e03Hexagon;

import java.awt.*;

import static java.lang.Math.sqrt;

public class Hexagon {
    int sideLength;
    int x;
    int y;

    public Hexagon(int x, int y, int sideLength) {
        this.x = x;
        this.y = y;
        this.sideLength = sideLength;
    }

    public void drawHexagon(Graphics graphics) {
        int[] xPoints = {x + sideLength/2, x + 3*sideLength/2, x + 2*sideLength, x + 3*sideLength/2, x + sideLength/2, x};
        int[] yPoints = {y, y, (int)(y+sqrt(3)*sideLength/2), (int)(y+sqrt(3)*sideLength), (int)(y+sqrt(3)*sideLength), (int)(y+sqrt(3)*sideLength/2)};

        graphics.drawPolygon(xPoints, yPoints, 6);
    }
}
