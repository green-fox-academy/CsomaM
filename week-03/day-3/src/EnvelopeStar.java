import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {

    public static void mainDraw(Graphics graphics){
      // reproduce this:
      // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/envelope-star/r2.png]
        for (int i = 1; i < 17; i++) {
            drawLine(graphics, i);
        }
    }

    static void drawLine (Graphics g, int i) {
        g.setColor(Color.green);
        g.drawLine(10 * i,160,160, 160 - 10 * i);
        g.drawLine(160,10 * i,160 + i * 10, 160);
        g.drawLine(320 - i * 10,160,160, 160 + i * 10);
        g.drawLine(160,320 - i * 10,160 - i * 10, 160);
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
