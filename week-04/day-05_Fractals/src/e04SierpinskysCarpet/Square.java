package e04SierpinskysCarpet;

import java.awt.*;

public class Square {
    int x;
    int y;
    int side;

    public  Square(int x, int y, int side) {
        this.x = x;
        this.y = y;
        this.side = side;
    }
     public void drawFilledSquare(Graphics graphics) {
        graphics.fillRect(x, y, side, side);
     }

}
