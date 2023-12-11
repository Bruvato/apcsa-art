package RayArt;

import java.awt.*;

public class SquareSquared {

    private int x, y, size;
    private Color colorA, colorB;

    public SquareSquared(int x, int y, int size, Color colorA, Color colorB) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.colorA = colorA;
        this.colorB = colorB;
    }

    public void draw(Graphics2D g2){
        g2.setColor(colorA);
        g2.fillRect(x, y, size, size);
        g2.setColor(colorB);
        g2.fillRect(x+size/4, y+size/4, size/2, size/2);


//        for (int i = 0; i < 4; i++) {
//            if(i % 2 == 0)
//                g2.setColor(colorA);
//            else
//                g2.setColor(colorB);
//            int border = size/8*i;
//            g2.fillRect(x+border, y+border, size-border*2, size-border*2);
//        }
    }
}