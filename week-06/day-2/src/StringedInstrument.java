abstract class StringedInstrument extends Instrument{

    protected int numberOfStrings;
    protected String sound;

    public void sound(String sound) {
        this.sound = sound;
    }

    @Override
    public void play() {
        System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that " + sound + ".");
    }
}
