package e01Triangles;

import java.awt.*;

import static java.lang.Math.sqrt;

public class Triangle {
    int sideLength;
    int x;
    int y;

    public Triangle(int sideLength, int x, int y) {
        this.sideLength = sideLength;
        this.x = x;
        this.y = y;
    }

    public  int heightOfTriangle() {
        int m = (int)(((sqrt(3))/2) * sideLength);
        return  m;
    }

    public  void drawTriangle(Graphics graphics) {
       int m = heightOfTriangle();

        int[] xPoints = {x, x+sideLength/2, x-sideLength/2};
        int[]yPoints = {y, y+m, y+m};
        int nPoints = 3;

        graphics.drawPolygon(xPoints, yPoints, nPoints);
    }
    public  void drawReverseTriangle(Graphics graphics) {
        int m = heightOfTriangle();

        int[] xPoints = {x, x+sideLength/2, x-sideLength/2};
        int[]yPoints = {y, y-m, y-m};
        int nPoints = 3;

        graphics.drawPolygon(xPoints, yPoints, nPoints);
    }


}
