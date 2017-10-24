import java.util.ArrayList;
import java.util.Random;

public class Car {

    protected String colour;
    protected String type;

    public Car (String colour, String type) {
        this.colour = colour;
        this.type = type;
    }

    public enum Type {
        Lada, Trabant, Dacia
    }

    public enum Colour {
        beachFenceBlue, sausageFatOrange, babyGooseGreen
    }


}
