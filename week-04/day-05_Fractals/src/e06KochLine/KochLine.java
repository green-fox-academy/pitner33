package e06KochLine;

import java.awt.*;

public class KochLine {
    int n;
    int x1;
    int y1;
    int x5;
    int y5;

    public KochLine(int n, int x1, int y1, int x5, int y5) {
        this.n = n;
        this.x1 = x1;
        this.y1 = y1;
        this.x5 = x5;
        this.y5 = y5;
    }

    public void drawKochLine(Graphics graphics) {
        graphics.drawLine(x1, y1, x5, y5);

    }
}
