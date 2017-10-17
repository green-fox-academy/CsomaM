public class BassGuitar extends StringedInstrument {

    public BassGuitar () {
        super.name = "Bass Guitar";
        this.sound("goes Duum-duum-duum");
        super.numberOfStrings = 4;
    }

    public BassGuitar (int strings) {
        super.name = "Bass Guitar";
        this.sound("goes Duum-duum-duum");
        super.numberOfStrings = strings;
    }
}
