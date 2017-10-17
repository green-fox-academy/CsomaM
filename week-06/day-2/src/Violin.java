public class Violin extends StringedInstrument {

    public Violin () {
        super.name = "Violin";
        this.sound("Screeches");
        super.numberOfStrings = 4;
    }

    public Violin (int strings) {
        super.name = "Violin";
        this.sound("Screeches");
        super.numberOfStrings = strings;
    }
}
