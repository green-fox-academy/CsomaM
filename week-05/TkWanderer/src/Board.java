import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

public class Board extends JComponent implements KeyListener {

    Random r = new Random();
    Hero player = new Hero("player");
    Boss boss = new Boss();
    int monsterN = r.nextInt(3) + 3;
    ArrayList<Character> monsters = new ArrayList<>();
    int round = 1;
    Map map = new Map();

    public Board() {
        for (int i = 0; i < monsterN; i++) {
            Monster m = new Monster();
            monsters.add(m);
        }
        monsters.add(boss);
        // set the size of your draw board
        setPreferredSize(new Dimension(720, 760));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.
        map.drawMap(graphics);
        if (round % 2 == 0) {
            for (int i = 0; i < monsters.size(); i++) {
                if (!monsters.get(i).isAtked())
                    monsters.get(i).randomMove();
            }
        }
        for (int i = 0; i < monsters.size(); i++) {
            if (!monsters.get(i).isDead()) {
                monsters.get(i).draw(graphics);
            } else {
                monsters.get(i).kill();
            }
        }
        HUD hud = new HUD(player);
        if (player.getCurrentHp() > 0) {
            player.draw(graphics);
            player.drawText(graphics, hud.display());
        }
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
            round ++;
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            player.moveDOWN();
            round ++;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            player.moveLEFT();
            round ++;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            player.moveRIGHT();
            round ++;
        } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            for (int i = 0; i < monsterN; i++) {
                if (monsters.get(i).getPosX() == player.getPosX() && monsters.get(i).getPosY() == player.getPosY() && !monsters.get(i).isDead()) {
                    monsters.get(i).underATK();
                    player.battle(player, monsters.get(i));
                    player.battle(monsters.get(i), player);
                }
            }
            if (boss.getPosX() == player.getPosX() && boss.getPosY() == player.getPosY() && !boss.isDead()) {
                boss.underATK();
                player.battle(player, boss);
                player.battle(boss, player);
            }
        }
        // and redraw to have a new picture with the new coordinates
        repaint();
    }
}

