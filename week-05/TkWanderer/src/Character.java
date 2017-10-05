import java.util.Random;

public class Character extends PositionedImage{

    Random r = new Random();
    Map map = new Map();

    public int[][] cheatsheet = map.getMap();

    public int lvl = 1;
    public int hp = 1;
    public int currentHP = hp;
    public int dp = 1;
    public int sp = 1;
    public String name = "Jon Doe";
    public boolean attacked = false;

    public Character (String fileName, int posX, int posY) {
        super(fileName, posX, posY);
    }

    public int getHp() {
        return hp;
    }

    public void setHP(int amount) {
        this.hp += amount;
    }

    public int getCurrentHp() {
        return currentHP;
    }

    public void setCurrentHP (int dmg) {
        currentHP -= dmg;
    }

    public int getDp() {
        return dp;
    }

    public void setDp(int amount) {
        this.dp += amount;
    }

    public int getSp() {
        return sp;
    }

    public void setSp(int amount) {
        this.sp += amount;
    }

    public String getName() {
        return name;
    }

    public int getLvl() {
        return lvl;
    }

    public boolean isDead () {
        if (currentHP == 0 || currentHP < 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isAtked () {
        if (attacked == true) {
            return true;
        } else
            return false;
    }

    public void kill () {
        this.dp = 0;
        this.sp = 0;
    }

    public void underATK () {
        attacked = true;
    }

    public void moveUP () {
        if (posY != 0 && cheatsheet[posY - 1][posX]!= 1){
            super.posY --;
        }
    }

    public void moveDOWN () {
        if (posY != 9 && cheatsheet[posY + 1][posX]!= 1){
            super.posY ++;
        }
    }

    public void moveLEFT () {
        if (posX != 0 && cheatsheet[posY][posX - 1]!= 1){
            super.posX --;
        }
    }

    public void moveRIGHT () {
        if (posX != 9 && cheatsheet[posY][posX + 1]!= 1){
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
        } while (cheatsheet[posY][posX] != 0);
        this.posX = posX;
        this.posY = posY;
        cheatsheet[posY][posX] = 1;
    }

    public void randomMove () {
        int rando = r.nextInt(4);
        for (int i = 0; i < 4; i++) {
            if (isUp() && rando == 1) {
                moveUP();
                break;
            } else if (isDown() && rando == 2) {
                moveDOWN();
                break;
            } else if (isLeft() && rando == 3) {
                moveLEFT();
                break;
            } else if (isRight() && rando == 4) {
                moveRIGHT();
                break;
            }
        }
    }

    public boolean isUp () {
        boolean possible = false;
        if (posY != 0 && cheatsheet[posY - 1][posX]!= 1){
            possible = true;
        }
        return possible;
    }

    public boolean isDown () {
        boolean possible = false;
        if (posY != 9 && cheatsheet[posY + 1][posX]!= 1){
            possible = true;
        }
        return possible;
    }

    public boolean isLeft () {
        boolean possible = false;
        if (posX != 0 && cheatsheet[posY][posX - 1]!= 1){
            possible = true;
        }
        return possible;
    }

    public boolean isRight () {
        boolean possible = false;
        if (posX != 9 && cheatsheet[posY][posX + 1]!= 1){
            possible = true;
        }
        return possible;
    }

    public void lvlUP (Character character) {
        character.setHP(r.nextInt(5) + 1);
        character.setDp(r.nextInt(5) + 1);
        character.setSp(r.nextInt(5) + 1);
        character.lvl ++;
    }

    public void battle (Character character, Character otherCharacter) {
        int sv;
        int dmg;
        if (character.getCurrentHp() > 0 && otherCharacter.getCurrentHp() > 0) {
            sv = character.getSp() + 2 * r.nextInt(6);
            if (sv > otherCharacter.getDp()) {
                dmg = sv - otherCharacter.getDp();
            } else {
                dmg = 0;
            }
            otherCharacter.setCurrentHP(dmg);
        }
        if (otherCharacter.isDead()){
            lvlUP(character);
        }
    }
}
