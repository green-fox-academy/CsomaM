public class Shifter implements CharSequence {

    String s;
    int shift;

    public Shifter (String s, int shift) {
        this.s = s;
        this.shift = shift;
    }

    @Override
    public int length() {
        return this.s.length();
    }

    @Override
    public char charAt(int index) {
        return this.s.charAt(0 + shift);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
