package RayArt;

import java.awt.*;
import java.util.Random;

public class RandomStars {

    private int minX,maxX,minY,maxY;
    private int minSize,maxSize;

    public RandomStars(int minX,int maxX,int minY,int maxY,int minSize,int maxSize){
        this.minX = minX;
        this.maxX = maxX;
        this.minY = minY;
        this.maxY = maxY;
        this.minSize = minSize;
        this.maxSize = maxSize;
    }
    public void drawStars(int numStars,Graphics2D g2){
        for (int i = 0; i < numStars ; i++) {
            int locX = (int) (Math.random() * (maxX - minX + 1)) + minX;
            int locY = (int) (Math.random() * (maxY - minY + 1)) + minY;
            int scale = (int) (Math.random() * (maxSize - minSize + 1)) + minSize;

            int [] pentagonX = {3*scale+locX,2*scale+locX,0+locX,2*scale+locX,3*scale+locX,4*scale+locX,6*scale+locX,4*scale+locX};
            int [] pentagonY = {0+locY,2*scale+locY,3*scale+locY,4*scale+locY,6*scale+locY,4*scale+locY,3*scale+locY,2*scale+locY};

            Random rand = new Random();
            int upperbound = 2;
            int int_random = rand.nextInt(upperbound);

            if (int_random==0){
                Color yellow = Color.decode("#FEF284");
                g2.setColor(yellow);
                g2.fillPolygon( pentagonX, pentagonY, 8);
            }else{
                Color white = Color.decode("#FFFFFF");
                g2.setColor(white);
                g2.fillPolygon( pentagonX, pentagonY, 8);
            }
        }






//    public static Color getRandomColor(){
//        int red = (int)(Math.random()*256);
//        int green = (int)(Math.random()*256);
//        int blue = (int)(Math.random()*256);
//        int alpha = (int)(Math.random()*256);
//        return new Color(red, green, blue, alpha);
    }
}