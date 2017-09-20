import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
      // draw four different size and color rectangles.
        drawSquare(graphics,10,10, 40,50);
        drawSquare(graphics,15,30, 100,150);
        drawSquare(graphics,200,100, 80,10);
        drawSquare(graphics,50,5, 10,200);
    }

    static void drawSquare (Graphics g, int x, int y, int width, int height) {
        g.drawRect(x,y,width,height);
    }

//    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}
