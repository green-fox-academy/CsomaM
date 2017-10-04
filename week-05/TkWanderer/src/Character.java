import java.util.Random;

public class Character extends PositionedImage{

    protected int[][] walls = new int[][]{
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

    public Character (String fileName, int posX, int posY) {
        super(fileName, posX, posY);
    }

    public void moveUP () {
        if (posY != 0 && walls[posY - 1][posX]!= 1){
            super.posY --;
        }
    }

    public void moveDOWN () {
        if (posY != 9 && walls[posY + 1][posX]!= 1){
            super.posY ++;
        }
    }

    public void moveLEFT () {
        if (posX != 0 && walls[posY][posX - 1]!= 1){
            super.posX --;
        }
    }

    public void moveRIGHT () {
        if (posX != 9 && walls[posY][posX + 1]!= 1){
            super.posX ++;
        }
    }

    public void posGEN () {
        Random r = new Random();
        int posX;
        int posY;
        do {
            posX = r.nextInt(6) + 3;
            posY = r.nextInt(6) + 3;
        } while (walls[posY][posX] != 0);
        this.posX = posX;
        this.posY = posY;
        walls[posY][posX] = 1;
    }

    public void randomMove () {
        for (int i = 0; i < 4; i++) {
            if (isUp()) {
                moveUP();
                break;
            } else if (isDown()) {
                moveDOWN();
                break;
            } else if (isLeft()) {
                moveLEFT();
                break;
            } else if (isRight()) {
                moveRIGHT();
                break;
            }
        }
    }

    public boolean isUp () {
        boolean possible = false;
        if (posY != 0 && walls[posY - 1][posX]!= 1){
            possible = true;
        }
        return possible;
    }

    public boolean isDown () {
        boolean possible = false;
        if (posY != 9 && walls[posY + 1][posX]!= 1){
            possible = true;
        }
        return possible;
    }

    public boolean isLeft () {
        boolean possible = false;
        if (posX != 0 && walls[posY][posX - 1]!= 1){
            possible = true;
        }
        return possible;
    }

    public boolean isRight () {
        boolean possible = false;
        if (posX != 9 && walls[posY][posX + 1]!= 1){
            possible = true;
        }
        return possible;
    }

}
