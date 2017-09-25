public class Sharpie {
    public float inkAmmount = 100;
    public float width;
    public String color;

    public Sharpie(String color, float width){
        this.color = color;
        this.width = width;
    }

    public void use() {
        inkAmmount -= 1;
    }
}
