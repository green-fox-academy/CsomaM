import java.awt.*;

public class Map {

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
            { 0, 0, 0, 1, 0, 1, 1, 0, 0, 0 }
    };

    Floor floor = new Floor(0, 0);
    Wall wall = new Wall(0, 0);

    public void drawMap (Graphics graphics) {
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
    }

    public boolean isWall (int x, int y) {
        if (walls[x][y] == 1) {
            return true;
        } else {
            return false;
        }
    }

    public int[][] getMap () {
        return walls;
    }
}
