package e02Circles;

import java.awt.*;

public class Circle {
    int x;
    int y;
    int diameter;

    public Circle(int x, int y, int diameter) {
        this.x = x;
        this.y = y;
        this.diameter = diameter;
    }

    public void drawCircle(Graphics graphics) {
        graphics.drawOval(x, y, diameter, diameter);
    }
}
