import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {

    public static void mainDraw(Graphics graphics){
      // fill the canvas with a checkerboard pattern.


        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 17; j++) {
                drawSquare(graphics, i, j);
            }
        }
        for (int i = 1; i < 17; i+=2) {
            for (int j = 1; j < 17; j+=2) {
                drawSquare2(graphics, i, j);
            }
        }
    }

    static void drawSquare(Graphics g1, int i, int j) {
            if (i % 2 == 0 && j % 2 == 0 ) {
                g1.setColor(Color.black);
                g1.fillRect(i * 20, j * 20, 20, 20);
            } else {
                g1.setColor(Color.red);
                g1.fillRect(i*20, j * 20, 20, 20);
            }
    }

    static void drawSquare2(Graphics g1, int i, int j) {
            g1.setColor(Color.black);
            g1.fillRect(i * 20, 20*j, 20, 20);
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
