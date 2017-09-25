public class Sharpie {
    private float inkAmmount = 100;
    private float width;
    private String color;

    public Sharpie(String color, float width){
        this.color = color;
        this.width = width;
    }

    public void use() {
        inkAmmount -= 1;
    }
}
