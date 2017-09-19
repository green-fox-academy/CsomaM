import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-order.txt
        reverse("C:\\GreenFox\\CsomaM\\week-03\\day-2\\src\\reversed-order.txt");
    }

    static void reverse (String path) {
        Path myPath = Paths.get(path);
        List<String> reversed = null;
        try {
            reversed = Files.readAllLines(myPath);
            List<String> correct = new ArrayList<>();
            for (int i = reversed.size()-1; i >=0; i--) {
                String element = reversed.get(i);
                correct.add(element + "\n");
            }
            System.out.println(correct.toString().replace("[", "").replace("]", "").replace(",", ""));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
