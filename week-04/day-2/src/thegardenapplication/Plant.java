package thegardenapplication;

public class Plant {

    protected String name;
    protected String colour;
    protected float waterAmount;
    protected int enoughWater;
    protected double absorb;

    public Plant () {
        waterAmount = 0;
    }

    public boolean needsWater () {
        if (waterAmount < enoughWater) {
            return true;
        } else {
            return false;
        }
    }

    public void water (float water) {
        waterAmount += water*0.75;
    }

    @Override
    public String toString() {
        if (needsWater()) {
            return ("The " + colour + " " + name + " needs water." );
        } else {
            return ("The " + colour + " " + name + " doesn't need water.");
        }

    }

}
