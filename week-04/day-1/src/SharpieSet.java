import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    List<Sharpie> list = new ArrayList<>();

    public int countUsable (List<Sharpie> list) {
        int count = 0;
        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i).inkAmmount > 0) {
                count++;
            }
        }
        return count;
    }

    public void removeTrash (List<Sharpie> list) {
        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i).inkAmmount == 0) {
                list.remove(i);
            }
        }
    }
}
