package RayArt;

import ArtExamples.RotationExample;
import Drawing.GraphicsUtility;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {


    public MyPanel(int width, int height) {
        setSize(width, height);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;


        Color background = new Color(255, 255, 255);
        g2.setColor(background);
        g2.fillRect(0, 0, 1000, 1000);

        //RotationExample rot = new RotationExample(0, 0, 100, 100, 45);
        //rot.draw(g2);

        //g2.setColor(Color.RED);
        //g2.fillOval(0-10, -10, 20, 20);

        int colorPicker = 0;
        int wAndH = 1200;
        int rotation = 30;
        for (int xAndy = -200; xAndy <= 800; xAndy += 5) {

            if (colorPicker % 9 == 0) {
                Color blue1 = new Color(1,0,2);
                g2.setColor(blue1);
                ArtExamples.RotationExample rot1 = new RotationExample(xAndy, xAndy, wAndH, wAndH, rotation);
                rot1.draw(g2);
            } else if (colorPicker % 9 == 1) {
                Color blue2 = new Color(1,0,11);
                g2.setColor(blue2);
                ArtExamples.RotationExample rot1 = new RotationExample(xAndy, xAndy, wAndH, wAndH, rotation * 2);
                rot1.draw(g2);
            } else if (colorPicker % 9 == 2) {
                Color blue3 = new Color(1,1,17);
                g2.setColor(blue3);
                ArtExamples.RotationExample rot1 = new RotationExample(xAndy, xAndy, wAndH, wAndH, rotation * 3);
                rot1.draw(g2);
            } else if (colorPicker % 9 == 3) {
                Color blue4 = new Color(2,1,25);
                g2.setColor(blue4);
                ArtExamples.RotationExample rot1 = new RotationExample(xAndy, xAndy, wAndH, wAndH, rotation * 4);
                rot1.draw(g2);
            } else if (colorPicker % 9 == 4) {
                Color blue5 = new Color(2,2,42);
                g2.setColor(blue5);
                ArtExamples.RotationExample rot1 = new RotationExample(xAndy, xAndy, wAndH, wAndH, rotation * 5);
                rot1.draw(g2);
            } else if (colorPicker % 9 == 5) {
                Color blue6 = new Color(3,2,53);
                g2.setColor(blue6);
                ArtExamples.RotationExample rot1 = new RotationExample(xAndy, xAndy, wAndH, wAndH, rotation * 6);
                rot1.draw(g2);
            } else if (colorPicker % 9 == 6) {
                Color blue7 = new Color(3,2,59);
                g2.setColor(blue7);
                ArtExamples.RotationExample rot1 = new RotationExample(xAndy, xAndy, wAndH, wAndH, rotation * 7);
                rot1.draw(g2);
            } else if (colorPicker % 9 == 7) {
                Color blue8 = new Color(3,3,68);
                g2.setColor(blue8);
                ArtExamples.RotationExample rot1 = new RotationExample(xAndy, xAndy, wAndH, wAndH, rotation * 8);
                rot1.draw(g2);
            } else if (colorPicker % 9 == 8) {
                Color blue9 = new Color(3,3,73);
                g2.setColor(blue9);
                ArtExamples.RotationExample rot1 = new RotationExample(xAndy, xAndy, wAndH, wAndH, rotation * 9);
                rot1.draw(g2);
            } else if (colorPicker % 9 == 10) {
                Color blue11 = new Color(3,3,80);
                g2.setColor(blue11);
                ArtExamples.RotationExample rot1 = new RotationExample(xAndy, xAndy, wAndH, wAndH, rotation * 10);
                rot1.draw(g2);
            } else if (colorPicker % 9 == 9) {
                Color blue10 = new Color(4,4,86);
                g2.setColor(blue10);
                ArtExamples.RotationExample rot1 = new RotationExample(xAndy, xAndy, wAndH, wAndH, rotation * 11);
                rot1.draw(g2);
            }

            wAndH -= 10;

            colorPicker++;
        }

        RandomOvals myOvals = new RandomOvals(0,800,0,800,1,3);
        myOvals.drawOvals(500,g2);

        RandomStars myStars = new RandomStars(0,800,0,800,1,3);
        myStars.drawStars(50,g2);

        //repaint();

//        Color myColor = Color.decode("#67c8f9");
//        g2.setColor(myColor);
//        //g2.fillPolygon(xList,yList, 26);
//        int[] b1XList = {455,460,352};
//        int[] b1YList = {261,280,257};
//        Color b1 = new Color(9, 227, 252);
//        g2.setColor(b1);
//        //g2.fillPolygon(b1XList,b1YList,3);



/*
        RayArt.Polygon color = new RayArt.Polygon();
        color.draw(g2);
 */
        RayArt.Polygon b1 = new RayArt.Polygon(455,261,460,280,352,257, 9,227, 225);
        b1.draw(g2);
        RayArt.Polygon b53 = new RayArt.Polygon(295,313,352,257,368,313,4,219,247);
        b53.draw(g2);
        RayArt.Polygon b54 = new RayArt.Polygon(352,257,368,313,460,280,7,208,238);
        b54.draw(g2);
        RayArt.Polygon b2 = new RayArt.Polygon(352,257,374,258,358,276,80,173,7);
        b2.draw(g2);
        RayArt.Polygon g3 = new RayArt.Polygon(352,257,358,276,334,275,103,197,38);
        g3.draw(g2);
        RayArt.Polygon g4 = new RayArt.Polygon(352,257,334,275,296,287,191,248,55);
        g4.draw(g2);
        RayArt.Polygon b5 = new RayArt.Polygon(296,287,334,275,319,290,126,207,24);
        b5.draw(g2);
        RayArt.Polygon g5a = new RayArt.Polygon(334,275,348,285,319,290,109,192,24);
        g5a.draw(g2);
        RayArt.Polygon g5b = new RayArt.Polygon(334,275,348,285,344,275,90,174,26);
        g5b.draw(g2);
        RayArt.Polygon g6 = new RayArt.Polygon(296,287,319,290,295,313,142,228,41);
        g6.draw(g2);
        RayArt.Polygon g6a = new RayArt.Polygon(295,313,305,303,304,313,82,156,11);
        g6a.draw(g2);
        RayArt.Polygon b52 = new RayArt.Polygon(295,313,368,313,302,409,6,166,216);
        b52.draw(g2);
        RayArt.Polygon g7 = new RayArt.Polygon(296,287,295,313,276,313,194,251,50);
        g7.draw(g2);
        RayArt.Polygon g7a = new RayArt.Polygon(295,313,304,313,296,326,151,227,31);
        g7a.draw(g2);
        RayArt.Polygon b8 = new RayArt.Polygon(276,313,295,313,256,340,8,247,252);
        b8.draw(g2);
        RayArt.Polygon b9 = new RayArt.Polygon(256,340,295,313,251,413,9,185,242);
        b9.draw(g2);
        RayArt.Polygon b10 = new RayArt.Polygon(251,413,295,313,302,409,6,172,220);
        b10.draw(g2);
        RayArt.Polygon b11 = new RayArt.Polygon(251,413,302,409,289,488,7,147,200);
        b11.draw(g2);
        RayArt.Polygon b12 = new RayArt.Polygon(302,409,387,497,289,488,7,143,193);
        b12.draw(g2);
        RayArt.Polygon b13 = new RayArt.Polygon(289,488,387,497,340,532,3,95,144);
        b13.draw(g2);
        RayArt.Polygon b14 = new RayArt.Polygon(387,497,433,542,340,532,5,98,159);
        b14.draw(g2);
        RayArt.Polygon g15 = new RayArt.Polygon(365,521,372,512,377,521,30,92,29);
        g15.draw(g2);
        RayArt.Polygon w16 = new RayArt.Polygon(370,536,403,530,433,542,181,226,249);
        w16.draw(g2);
        RayArt.Polygon b17 = new RayArt.Polygon(387,497,494,482,433,542,3,82,141);
        b17.draw(g2);
        RayArt.Polygon b19 = new RayArt.Polygon(433,542,494,482,495,508,6,64,110);
        b19.draw(g2);
        RayArt.Polygon w18 = new RayArt.Polygon(433,542,441,534,445,536,181,226,249);
        w18.draw(g2);
        RayArt.Polygon g81 = new RayArt.Polygon(500,338,489,362,517,380,42,134,10);
        g81.draw(g2);
        RayArt.Polygon g82 = new RayArt.Polygon(500,338,517,380,531,336,35,110,7);
        g82.draw(g2);
        RayArt.Polygon g83 = new RayArt.Polygon(517,380,538,384,539,421, 2,67,0);
        g83.draw(g2);
        RayArt.Polygon g84 = new RayArt.Polygon(517,380,531,336,538,384,50,115,47);
        g84.draw(g2);
        RayArt.Polygon b20 = new RayArt.Polygon(494,482,501,495,495,508,2,83,123);
        b20.draw(g2);
        RayArt.Polygon b50 = new RayArt.Polygon(517,380,525,442,494,482,7,95,167);
        b50.draw(g2);
        RayArt.Polygon g21 = new RayArt.Polygon(494,482,510,478,501,495,21,77,12);
        g21.draw(g2);
        RayArt.Polygon g22 = new RayArt.Polygon(494,482,510,460,510,478,34,108,9);
        g22.draw(g2);
        RayArt.Polygon g23 = new RayArt.Polygon(510,460,510,478,539,421,17,80,0);
        g23.draw(g2);
        RayArt.Polygon g24 = new RayArt.Polygon(510,460,517,423,525,442,39,127,7);
        g24.draw(g2);
        RayArt.Polygon g25 = new RayArt.Polygon(517,423,539,421,525,442,25,105,8);
        g25.draw(g2);
        RayArt.Polygon g26 = new RayArt.Polygon(539,421,517,423,530,413,28,85,6);
        g26.draw(g2);
        RayArt.Polygon g27 = new RayArt.Polygon(539,421,517,380,513,400,36,103,6);
        g27.draw(g2);
        RayArt.Polygon g28 = new RayArt.Polygon(513,400,530,413,517,423,31,133,8);
        g28.draw(g2);
        RayArt.Polygon b49 = new RayArt.Polygon(425,420,494,482,517,380,6,142,194);
        b49.draw(g2);
        RayArt.Polygon g29 = new RayArt.Polygon(479,396,517,380,513,400,47,170,17);
        g29.draw(g2);
        RayArt.Polygon b51 = new RayArt.Polygon(425,420,452,340,517,380,7,154,206);
        b51.draw(g2);
        RayArt.Polygon g30 = new RayArt.Polygon(479,396,489,362,517,380,76,194,24);
        g30.draw(g2);
        RayArt.Polygon g31 = new RayArt.Polygon(467,350,489,362,479,396,56,161,16);
        g31.draw(g2);
        RayArt.Polygon g32 = new RayArt.Polygon(467,350,500,338,489,362,65,182,16);
        g32.draw(g2);
        RayArt.Polygon g33 = new RayArt.Polygon(467,350,481,317,500,338,78,212,27);
        g33.draw(g2);
        RayArt.Polygon g34 = new RayArt.Polygon(481,317,508,316,500,338,72,184,20);
        g34.draw(g2);
        RayArt.Polygon g35 = new RayArt.Polygon(508,316,531,336,500,338,56,138,12);
        g35.draw(g2);
        RayArt.Polygon g36 = new RayArt.Polygon(481,317,487,291,508,317,98,214,27);
        g36.draw(g2);
        RayArt.Polygon g37 = new RayArt.Polygon(511,306,531,336,483,295,91,213,18);
        g37.draw(g2);
        RayArt.Polygon g38 = new RayArt.Polygon(487,291,486,298,478,283,77,188,24);
        g38.draw(g2);
        RayArt.Polygon g41 = new RayArt.Polygon(455,261,466,271,460,280,131,211,16);
        g41.draw(g2);
        RayArt.Polygon b40 = new RayArt.Polygon(466,271,460,280,486,298,13,196,255);
        b40.draw(g2);
        RayArt.Polygon b40a = new RayArt.Polygon(466,271,478,283,486,298,13,196,255);
        b40a.draw(g2);
        RayArt.Polygon b42 = new RayArt.Polygon(460,280,486,298,481,317,13,187,240);
        b42.draw(g2);
        RayArt.Polygon b43 = new RayArt.Polygon(460,280,481,317,467,350,6,170,221);
        b43.draw(g2);
        RayArt.Polygon b43a = new RayArt.Polygon(460,280,452,340,467,350,6,170,221);
        b43a.draw(g2);
        RayArt.Polygon b44 = new RayArt.Polygon(460,280,452,340,368,313,5,189,223);
        b44.draw(g2);
        RayArt.Polygon b45 = new RayArt.Polygon(368,313,452,340,425,420,5,169,207);
        b45.draw(g2);
        RayArt.Polygon b46 = new RayArt.Polygon(368,313,425,420,302,409,8,183,226);
        b46.draw(g2);
        RayArt.Polygon b47 = new RayArt.Polygon(302,409,387,497,425,420,7,155,215);
        b47.draw(g2);
        RayArt.Polygon b48 = new RayArt.Polygon(387,497,425,420,494,482,6,111,176);
        b48.draw(g2);
        RayArt.Polygon g55 = new RayArt.Polygon(304,313,296,326,322,345,102,195,28);
        g55.draw(g2);
        RayArt.Polygon g56 = new RayArt.Polygon(304,313,322,314,322,345,75,171,9);
        g56.draw(g2);
        RayArt.Polygon g58 = new RayArt.Polygon(322,313,322,379,340,354,170,244,35);
        g58.draw(g2);
        RayArt.Polygon g57 = new RayArt.Polygon(322,313,368,313,340,354,141,229,29);
        g57.draw(g2);
        RayArt.Polygon g59 = new RayArt.Polygon(368,313,370,365,340,354,107,212,23);
        g59.draw(g2);
        RayArt.Polygon g60 = new RayArt.Polygon(368,313,402,376,370,365,85,176,19);
        g60.draw(g2);
        RayArt.Polygon g61 = new RayArt.Polygon(340,354,370,365,322,379,141,233,38);
        g61.draw(g2);
        RayArt.Polygon g62 = new RayArt.Polygon(322,379,370,365,347,400,72,159,16);
        g62.draw(g2);
        RayArt.Polygon g63 = new RayArt.Polygon(370,365,347,400,374,400,71,169,20);
        g63.draw(g2);
        RayArt.Polygon g64 = new RayArt.Polygon(370,365,402,376,374,400,91,210,24);
        g64.draw(g2);
        RayArt.Polygon g65 = new RayArt.Polygon(402,376,424,358,393,359,94,213,25);
        g65.draw(g2);
        RayArt.Polygon g66 = new RayArt.Polygon(424,358,414,397,402,376,55,129,16);
        g66.draw(g2);
        RayArt.Polygon g67 = new RayArt.Polygon(402,376,414,397,374,400,57,148,17);
        g67.draw(g2);
        RayArt.Polygon g68 = new RayArt.Polygon(414,397,374,400,395,416,61,160,15);
        g68.draw(g2);
        RayArt.Polygon g69 = new RayArt.Polygon(374,400,395,416,362,414,54,140,13);
        g69.draw(g2);
        RayArt.Polygon g70 = new RayArt.Polygon(374,400,362,414,347,400,101,211,26);
        g70.draw(g2);
        RayArt.Polygon g71 = new RayArt.Polygon(347,400,362,414,346,428,88,190,20);
        g71.draw(g2);
        RayArt.Polygon g72 = new RayArt.Polygon(362,414,346,428,378,441,63,146,16);
        g72.draw(g2);
        RayArt.Polygon g73 = new RayArt.Polygon(362,414,378,441,395,416,63,154,15);
        g73.draw(g2);
        RayArt.Polygon g74 = new RayArt.Polygon(346,428,378,441,346,453,64,124,10);
        g74.draw(g2);
        RayArt.Polygon g75 = new RayArt.Polygon(378,441,346,453,360,467,52,151,6);
        g75.draw(g2);
        RayArt.Polygon g76 = new RayArt.Polygon(346,453,360,467,346,472,55,128,10);
        g76.draw(g2);
        RayArt.Polygon g77 = new RayArt.Polygon(360,467,346,472,359,479,34,97,8);
        g77.draw(g2);
        RayArt.Polygon g78 = new RayArt.Polygon(346,472,359,479,343,481,43,132,26);
        g78.draw(g2);
        RayArt.Polygon g79 = new RayArt.Polygon(359,479,343,481,359,493,49,104,11);
        g79.draw(g2);
        RayArt.Polygon g80 = new RayArt.Polygon(343,481,359,493,348,493,40,76,12);
        g80.draw(g2);
/*
        int scale = 5;
        int locX = 0;
        int locY = 0;
        int [] pentagonX = {3*scale+locX,2*scale+locX,0+locX,2*scale+locX,3*scale+locX,4*scale+locX,6*scale+locX,4*scale+locX};
        int [] pentagonY = {0+locY,2*scale+locY,3*scale+locY,4*scale+locY,6*scale+locY,4*scale+locY,3*scale+locY,2*scale+locY};
        g2.setColor(Color.white);
        g2.fillPolygon( pentagonX, pentagonY, 8);

 */

    }

}





//            int size = 80;
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                SquareSquared s = new SquareSquared(i * (size*5/4)+20, j*(size*5/4)+20 , size, getRandomRed(), getRandomBlue());
//               // s.draw(g2);
//            }
//        }
//    }

//    public Color getRandomRed(){
//        int r = (int)(Math.random()*55)+200;
//        int g = (int)(Math.random()*150);
//        int b = (int)(Math.random()*150);
//        return new Color(r,g,b);
//    }
//    public Color getRandomBlue(){
//        int r = (int)(Math.random()*150);
//        int g = (int)(Math.random()*150);
//        int b = (int)(Math.random()*50)+205;
//        return new Color(r,g,b);
//    }
