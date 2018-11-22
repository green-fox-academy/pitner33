package e05SquareGrid;

import java.awt.*;

public class FilledFrame {
    int x;
    int y;
    int width;
    int height;

    public FilledFrame(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void drawFilledFrame(Graphics graphics) {
        graphics.fillRect(x, y, width, height);
        graphics.fillRect(x, y, height, width);
        graphics.fillRect(x, y+width-height, width, height);
        graphics.fillRect(x+width-height, y, height, width);
    }
}
