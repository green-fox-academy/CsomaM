public class Character extends PositionedImage{

    public Character (String fileName, int posX, int posY) {
        super(fileName, posX, posY);
    }

    public void moveUP (int[][] walls) {
        if (posY != 0 && walls[posY - 1][posX]!= 1){
            super.posY --;
        }
    }

    public void moveDOWN (int[][] walls) {
        if (posY != 9 && walls[posY + 1][posX]!= 1){
            super.posY ++;
        }

    }

    public void moveLEFT (int[][] walls) {
        if (posX != 0 && walls[posY][posX - 1]!= 1){
            super.posX --;
        }

    }

    public void moveRIGHT (int[][] walls) {
        if (posX != 9 && walls[posY][posX + 1]!= 1){
            super.posX ++;
        }

    }

}
