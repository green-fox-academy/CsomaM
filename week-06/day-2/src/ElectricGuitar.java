public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar () {
        super.name = "Electric Guitar";
        this.sound("Twangs");
        super.numberOfStrings = 6;
    }

    public ElectricGuitar (int strings) {
        super.name = "Electric Guitar";
        this.sound("Twangs");
        super.numberOfStrings = strings;
    }
}
