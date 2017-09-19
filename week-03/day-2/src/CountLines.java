// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class CountLines {
    public static void main(String[] args) {
        Path myPath = Paths.get(fileNameInput());
        try {
            List<String> lines = Files.readAllLines(myPath);
        } catch (IOException e) {
            System.out.println("0");
        }
    }

    static String fileNameInput () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a filename.");
        String filename = sc.nextLine();
        return filename;
    }
}