package RayArt;

import javax.swing.*;

public class GraphicsMain  {

    public static void main(String[] args) {
        JFrame window = new JFrame("Graphics!");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        int width = 800, height = 800;
        window.setBounds(0,0,width,height+28);
        JPanel panel = new MyPanel(width, height);

        panel.setFocusable(true);
        panel.grabFocus();
        window.add(panel);
        window.setVisible(true);
    }
}