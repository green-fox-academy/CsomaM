public class Counter {
    private int value = 0;
    private int originalN = 0;

    public Counter(int value) {
        this.originalN = value;
        this.value = value;
    }

    public Counter() {
        this.originalN = 0;
        this.value = 0;
    }

    public void add(int addN) {
        this.value += addN;
    }

    public void add() {
        this.value++;
    }

    public int get() {
        return value;
    }

    public void reset() {
        this.value = originalN;
    }
}
