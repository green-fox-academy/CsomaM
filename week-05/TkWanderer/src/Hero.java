public class Hero extends Character {

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

    protected String fileName;

    public Hero () {
        super ("assets/hero-down.png", 0, 0);
    }

    @Override
    public void moveUP (int[][] walls) {
        super.moveUP(walls);
        super.setImage("assets/hero-up.png");
    }

    @Override
    public void moveDOWN (int[][] walls) {
        super.moveDOWN(walls);
        super.setImage( "assets/hero-down.png");
    }

    @Override
    public void moveLEFT (int[][] walls) {
        super.moveLEFT(walls);
        super.setImage("assets/hero-left.png");

    }

    @Override
    public void moveRIGHT (int[][] walls) {
        super.moveRIGHT(walls);
        super.setImage("assets/hero-right.png");
    }
}
