import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

    public static void mainDraw(Graphics graphics){
      // create a square drawing function that takes 1 parameter:
      // the square size
      // and draws a square of that size to the center of the canvas.
      // draw 3 squares with that function.
        drawSquare(graphics, 10, 10);
        drawSquare(graphics, 15, 30);
        drawSquare(graphics, 200, 100);
        drawSquare(graphics, 50, 5);
    }

    static void drawSquare(Graphics g, int width, int height) {
        g.drawRect(160-width/2, 171-height/2, width, height);
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
