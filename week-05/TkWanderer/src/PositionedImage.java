import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PositionedImage {

    protected BufferedImage image;
    protected int posX, posY;

    public PositionedImage(String filename, int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        setImage(filename);
    }

    public void setImage (String fileName) {
        try {
            this.image = ImageIO.read(new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics graphics) {
        if (image != null) {
            graphics.drawImage(image, posX*72, posY*72, null);
        }
    }

    public void drawText (Graphics graphics, String text) {
        graphics.setFont(new Font("TimesRoman", Font.BOLD, 24));
        graphics.drawString(text, 0, 750);
    }

    public int getPosX () {
        return posX;
    }

    public int getPosY () {
        return posY;
    }
}
