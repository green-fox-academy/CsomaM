import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt
        reverse("C:\\GreenFox\\CsomaM\\week-03\\day-2\\src\\reversed-lines.txt");
    }

    static void reverse (String path) {
        Path myPath = Paths.get(path);
        List<String> reversed = null;
        try {
            reversed = Files.readAllLines(myPath);
            List<String> correct = new ArrayList<>();
            for (int i = 0; i < reversed.size(); i++) {
                String element = reversed.get(i);
                String correctElement="";
                int length = element.length();
                    for (int j = length-1; j >= 0; j--) {
                            correctElement += element.charAt(j);
                    }
                correct.add(correctElement + "\n");
            }
            System.out.println(correct.toString().replace("[","").replace("]","").replace(",", ""));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
