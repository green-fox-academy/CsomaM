import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

public class Board extends JComponent implements KeyListener {

    int playerPosX;
    int playerPosY;
    int direction;
    int round;

    ArrayList<Integer> skelPOS = new ArrayList<>();
    ArrayList<Integer> bossPOS = new ArrayList<>();

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
        playerPosX = 0;
        playerPosY = 0;
        direction = 0;
        round = 0;

        // set the size of your draw board
        setPreferredSize(new Dimension(720, 720));
        setVisible(true);
    }

    public ArrayList<Integer> posGEN () {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        int posX;
        int posY;
        do {
            posX = r.nextInt(6) + 3;
            posY = r.nextInt(6) + 3;
        } while (walls[posY][posX] != 0);
        list.add(posX);
        list.add(posY);
        return list;
    }

    @Override
    public void paint(Graphics graphics) {
        Random r = new Random();
        super.paint(graphics);
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.
        PositionedImage floor = new PositionedImage("assets/floor.png", 0, 0);
        PositionedImage wall = new PositionedImage("assets/wall.png", 0, 0);
        PositionedImage heroUP = new PositionedImage("assets/hero-up.png", playerPosX, playerPosY);
        PositionedImage heroDOWN = new PositionedImage("assets/hero-down.png", playerPosX, playerPosY);
        PositionedImage heroLEFT = new PositionedImage("assets/hero-left.png", playerPosX, playerPosY);
        PositionedImage heroRIGHT = new PositionedImage("assets/hero-right.png", playerPosX, playerPosY);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                floor.posX = j;
                floor.posY = i;
                floor.draw(graphics);
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (walls[i][j] == 1) {
                    wall.posX = j;
                    wall.posY = i;
                    wall.draw(graphics);
                }
            }
        }

        if (direction == 0) {
            heroDOWN.draw(graphics);
        } else if (direction == 1) {
            heroUP.draw(graphics);
        } else if (direction == 2) {
            heroLEFT.draw(graphics);
        } else if (direction == 3) {
            heroRIGHT.draw(graphics);
        }

        if (round < 1) {
            bossPOS.addAll(posGEN());
            skelPOS.addAll(posGEN());
            skelPOS.addAll(posGEN());
            skelPOS.addAll(posGEN());
        }

        PositionedImage boss = new PositionedImage("assets/boss.png", bossPOS.get(0), bossPOS.get(1));
        PositionedImage skeleton1 = new PositionedImage("assets/skeleton.png", skelPOS.get(0), skelPOS.get(1));
        PositionedImage skeleton2 = new PositionedImage("assets/skeleton.png", skelPOS.get(2), skelPOS.get(3));
        PositionedImage skeleton3 = new PositionedImage("assets/skeleton.png", skelPOS.get(4), skelPOS.get(5));
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
        if (e.getKeyCode() == KeyEvent.VK_UP && playerPosY != 0 && walls[playerPosY - 1][playerPosX]!= 1) {
            playerPosY -= 1;
            direction = 1;
            round ++;
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN && playerPosY != 9 && walls[playerPosY + 1][playerPosX]!= 1) {
            playerPosY +=1;
            direction = 0;
            round ++;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT && playerPosX != 0 && walls[playerPosY][playerPosX - 1]!= 1) {
            playerPosX -= 1;
            direction = 2;
            round ++;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && playerPosX != 9 && walls[playerPosY][playerPosX + 1]!= 1) {
            playerPosX +=1;
            direction = 3;
            round ++;
        }
        // and redraw to have a new picture with the new coordinates
        repaint();
    }
}