import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {

    public static void mainDraw(Graphics graphics){
      // draw a box that has different colored lines on each edge.
        graphics.drawRect(5, 5, 295,295);
        graphics.setColor(Color.red);
        graphics.drawLine(5,5, 300,5);
        graphics.setColor(Color.blue);
        graphics.drawLine(5,5, 5,300);
        graphics.setColor(Color.green);
        graphics.drawLine(300,300, 5,300);
        graphics.setColor(Color.cyan);
        graphics.drawLine(300,300, 300,5);
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
