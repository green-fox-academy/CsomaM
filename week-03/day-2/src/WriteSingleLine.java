import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Open a file called "my-file.txt"
        // Write your name in it as a single line
        // If the program is unable to write the file,
        // then it should print an error message like: "Unable to write file: my-file.txt"

        Path myPath = Paths.get("my-file.txt");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        try {
            Files.write(myPath, name.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Unable to read file: my-file.txt");
        }

    }
}

