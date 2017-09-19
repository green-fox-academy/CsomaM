import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {

    public static void main(String[] args) {
        // Create a method that decrypts encoded-lines.txt
        decode("C:\\GreenFox\\CsomaM\\week-03\\day-2\\src\\encoded-lines.txt");

    }

    static void decode (String path){
        Path myPath = Paths.get(path);
        try {
            List<String> encoded = Files.readAllLines(myPath);
            List<String> decoded = new ArrayList<>();
            for (int i = 0; i < encoded.size(); i++) {
                String element = encoded.get(i);
                String correctElement= "";
                if (!element.equals(" ")) {
                    for (int j = 0; j < element.length(); j++) {
                        char index = element.charAt(j);
                        int ascii = 0;
                        if (index != '.' && index != ' ') {
                            ascii = index;
                            ascii = ascii - 1;
                            correctElement += (char)ascii;
                        } else {
                            correctElement += index;
                        }

                    }
                }
                decoded.add(correctElement + "\n");
            }
            System.out.println(decoded.toString().replace("[","").replace("]","").replace(",", ""));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
