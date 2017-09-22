import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {

    static Random r = new Random();

    static void mainDraw(Graphics graphics){
            graphics.setColor(Color.black);
            graphics.drawRect(0, 0, WIDTH, HEIGHT);
            graphics.fillRect(WIDTH/3, HEIGHT/3, WIDTH/3, HEIGHT/3);
            carpet(graphics, 5, 0, 0, WIDTH);
    }



    static void carpet(Graphics graphics, int n, int x, int y, int size) {
        int red = r.nextInt(255) + 1 ;
        int green =r.nextInt(255) + 1 ;
        int blue = r.nextInt(255) + 1 ;
        Color color = new Color(red,green,blue);
        graphics.setColor(color);
        graphics.fillRect(x + size / 3, y + size / 3, size / 3, size / 3);
        if (n != 0) {
            carpet(graphics, n - 1, x, y, size / 3);
            carpet(graphics, n - 1, x + size / 3, y, size / 3);
            carpet(graphics, n - 1, x + 2 * size / 3, y, size / 3);
            carpet(graphics, n - 1, x, y + size / 3, size / 3);
            carpet(graphics, n - 1, x + 2 * size / 3, y + size / 3, size / 3);
            carpet(graphics, n - 1, x, y + 2 * size / 3, size / 3);
            carpet(graphics, n - 1, x + size / 3, y + 2 * size / 3, size / 3);
            carpet(graphics, n - 1, x + 2 * size / 3, y + 2 * size / 3, size / 3);
        }
    }

    //    Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

    public static void main(String[] args) throws InterruptedException {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ImagePanel im = new ImagePanel();
        jFrame.setLocationRelativeTo(null);
        jFrame.add(im);
        im.setBackground(Color.black);
        jFrame.setVisible(true);
        boolean trip = false;
        do {
            im.repaint();
            Thread.sleep(200);
        } while (!trip);
    }

    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }
}