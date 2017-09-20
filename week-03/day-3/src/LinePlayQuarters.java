import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {

    public static void mainDraw(Graphics graphics){
      // divide the canvas into 4 parts
      // and repeat this pattern in each quarter:
      // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/line-play/r1.png]
        for (int i = 1; i < 17; i++) {
            drawLine(graphics, i);
        }
    }

    static void drawLine (Graphics g, int i) {
        g.setColor(Color.green);
        g.drawLine(10 * i,320,0, 160 + 10 * i);
        g.setColor(Color.blue);
        g.drawLine(0,10 * i,160 - i * 10, 0);
        g.setColor(Color.magenta);
        g.drawLine(320 - i * 10,0,320, 180 - i * 10);
        g.setColor(Color.cyan);
        g.drawLine(320 - i * 10,320,320, 160 + i * 10);
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
