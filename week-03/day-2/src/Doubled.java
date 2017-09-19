import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt 
        decrypt("C:\\GreenFox\\CsomaM\\week-03\\day-2\\src\\duplicated-chars.txt");
        
    }

    static void decrypt (String path){
        Path myPath = Paths.get(path);
        try {
            List<String> crypted = Files.readAllLines(myPath);
            List<String> decrypted = new ArrayList<>();
            for (int i = 0; i < crypted.size(); i++) {
                String element = crypted.get(i);
                String correctElement="";
                    for (int j = 0; j < element.length(); j += 2) {
                         correctElement += element.charAt(j);
                    }
                decrypted.add(correctElement + "\n");
            }
            System.out.println(decrypted.toString().replace("[","").replace("]","").replace(",", ""));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
