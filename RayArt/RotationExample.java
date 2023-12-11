package RayArt;

import java.awt.*;

public class RotationExample {

    private int x, y, w, h, angle;

    public RotationExample(int x, int y, int w, int h, int angle) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.angle = angle;
    }

    public void draw(Graphics2D g2){
        g2.translate(x, y);
        g2.rotate(Math.toRadians(angle));
        g2.fillRect(0,0, w, h);
        g2.rotate(-Math.toRadians(angle));
        g2.translate(-x, -y);
    }


}