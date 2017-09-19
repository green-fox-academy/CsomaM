import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
// Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number parameter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.

public class WriteMultipleLines {
    public static void main(String[] args) {
        writer("C:\\GreenFox\\CsomaM\\week-03\\day-2\\src\\WriteMultipleLines.txt", "apple", 5);
    }

    static void writer(String path, String word, int number) {
        Path myPath = Paths.get(path);
        List<String> newList = new ArrayList<>();
        try {
            for (int i = 0; i < number; i++) {
                newList.add(word);
            }
            Files.write(myPath, newList, StandardOpenOption.APPEND);
        } catch (IOException e) {
        }
    }
}