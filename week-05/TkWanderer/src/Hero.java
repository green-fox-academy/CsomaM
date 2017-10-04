public class Hero extends Character {

    protected String fileName;

    public Hero () {
        super ("assets/hero-down.png", 0, 0);
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
