public class Gnirts implements CharSequence{
    String s;

    public Gnirts (String s) {
        this.s = s;
    }

    @Override
    public int length() {
        return this.s.length();
    }

    @Override
    public char charAt(int index) {
        return this.s.charAt(this.s.length() - index - 1);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
