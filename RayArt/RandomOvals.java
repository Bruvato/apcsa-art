package RayArt;

import java.awt.*;
import java.util.Random;

public class RandomOvals {

    private int minX,maxX,minY,maxY;
    private int minSize,maxSize;

    public RandomOvals(int minX,int maxX,int minY,int maxY,int minSize,int maxSize){
        this.minX = minX;
        this.maxX = maxX;
        this.minY = minY;
        this.maxY = maxY;
        this.minSize = minSize;
        this.maxSize = maxSize;
    }
    public void drawOvals(int numOvals,Graphics2D g2){
        for (int i = 0; i < numOvals ; i++) {
            int x = (int) (Math.random() * (maxX - minX + 1)) + minX;
            int y = (int) (Math.random() * (maxY - minY + 1)) + minY;
            int size = (int) (Math.random() * (maxSize - minSize + 1)) + minSize;

            Random rand = new Random();
            int upperbound = 2;
            int int_random = rand.nextInt(upperbound);
            //int_random is 0,1,2,3,4,5

            if (int_random == 0){
                Color colorOne = Color.decode("#FFFFFF");
                g2.setColor(colorOne);
                g2.fillOval(x, y, size, size);
//            }if (int_random == 3){
//                Color colorTwo = Color.decode("#0CFFE1");
//                g2.setColor(colorTwo);
//                g2.fillOval(x, y, size, size);
            }if (int_random == 1){
                Color colorThree = Color.decode("#FEF284");
                g2.setColor(colorThree);
                g2.fillOval(x, y, size, size);
//            }if ((int_random == 5)){
//                Color colorFour = Color.decode("#FE5E78");
//                g2.setColor(colorFour);
//                g2.fillOval(x, y, size, size);
            }


//            Color colorOne = Color.decode("#FFFFFF");
//            g2.setColor(colorOne);
//            g2.fillOval(x, y, size, size);

        }






//    public static Color getRandomColor(){
//        int red = (int)(Math.random()*256);
//        int green = (int)(Math.random()*256);
//        int blue = (int)(Math.random()*256);
//        int alpha = (int)(Math.random()*256);
//        return new Color(red, green, blue, alpha);
    }
}