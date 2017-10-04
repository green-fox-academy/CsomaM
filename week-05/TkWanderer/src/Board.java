import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

public class Board extends JComponent implements KeyListener {

    Hero player = new Hero();
    Boss boss = new Boss();
    Monster skeleton1 = new Monster();
    Monster skeleton2 = new Monster();
    Monster skeleton3 = new Monster();

    int[][] walls = new int[][]{
            { 0, 0, 0, 1, 0, 1, 0, 0, 0, 0 },
            { 0, 0, 0, 1, 0, 1, 0, 1, 1, 0 },
            { 0, 1, 1, 1, 0, 1, 0, 1, 1, 0 },
            { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 },
            { 1, 1, 1, 1, 0, 1, 1, 1, 1, 0 },
            { 0, 1, 0, 1, 0, 0, 0, 0, 1, 0 },
            { 0, 1, 0, 1, 0, 1, 1, 0, 1, 0 },
            { 0, 0, 0, 0, 0, 1, 1, 0, 1, 0 },
            { 0, 1, 1, 1, 0, 0, 0, 0, 1, 0 },
            { 0, 0, 0, 1, 0, 1, 1, 0, 1, 0 }
    };

    public Board() {
        // set the size of your draw board
        setPreferredSize(new Dimension(720, 720));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        Random r = new Random();
        super.paint(graphics);
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.
        PositionedImage floor = new PositionedImage("assets/floor.png", 0, 0);
        PositionedImage wall = new PositionedImage("assets/wall.png", 0, 0);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                floor.posX = j;
                floor.posY = i;
                floor.draw(graphics);
                if (walls[i][j] == 1) {
                    wall.posX = j;
                    wall.posY = i;
                    wall.draw(graphics);
                }
            }
        }

        player.draw(graphics);
        boss.draw(graphics);
        skeleton1.draw(graphics);
        skeleton2.draw(graphics);
        skeleton3.draw(graphics);
    }

    public static void main(String[] args) {
        // Here is how you set up a new window and adding our board to it
        JFrame frame = new JFrame("RPG Game");
        Board board = new Board();
        frame.add(board);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        // Here is how you can add a key event listener
        // The board object will be notified when hitting any key
        // with the system calling one of the below 3 methods
        frame.addKeyListener(board);
        // Notice (at the top) that we can only do this
        // because this Board class (the type of the board object) is also a KeyListener
    }

    // To be a KeyListener the class needs to have these 3 methods in it
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    // But actually we can use just this one for our goals here
    @Override
    public void keyReleased(KeyEvent e) {
        // When the up or down keys hit, we change the position of our box
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            player.moveUP();
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            player.moveDOWN();
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            player.moveLEFT();
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            player.moveRIGHT();
        }
        // and redraw to have a new picture with the new coordinates
        repaint();
    }
}
