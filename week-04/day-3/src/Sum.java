import java.util.ArrayList;

public class Sum {

    ArrayList<Integer> list;

    public Sum (ArrayList<Integer> list) {
        this.list = list;
    }

    public int getSum () {
        int sum = 0;
        try {
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
            return sum;
        } catch (NullPointerException n) {
            return 0;
        }
    }
}
