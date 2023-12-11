package RayArt;

import java.awt.*;

public class Polygon {
    private int x1, x2, x3, y1, y2, y3, r, g, b;

    public Polygon(int x1,int y1,int x2,int y2,int x3,int y3,int r, int g, int b){
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.r = r;
        this.g = g;
        this.b = b;
    }
    public void draw(Graphics2D g2){
        int[] xList = {x1, x2, x3};
        int[] yList = {y1, y2, y3};
        Color myColor = new Color(r, g, b);
        g2.setColor(myColor);
        g2.fillPolygon(xList,yList,3);

    }
}
