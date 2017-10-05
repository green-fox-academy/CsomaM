import java.util.Random;

public class Hero extends Character {
    Random r = new Random();

    public Hero (String name) {
        super ("assets/hero-down.png", 0, 0);
        super.hp = 20 + 3 * r.nextInt(5) + 1;
        super.currentHP = hp;
        super.dp = 2 * r.nextInt(5) + 1;
        super.sp = 5 + r.nextInt(5) + 1;
        super.name = name;
        super.lvl = 1;
    }

    @Override
    public void moveUP () {
        super.moveUP();
        super.setImage("assets/hero-up.png");
    }

    @Override
    public void moveDOWN () {
        super.moveDOWN();
        super.setImage( "assets/hero-down.png");
    }

    @Override
    public void moveLEFT () {
        super.moveLEFT();
        super.setImage("assets/hero-left.png");

    }

    @Override
    public void moveRIGHT () {
        super.moveRIGHT();
        super.setImage("assets/hero-right.png");
    }
}
