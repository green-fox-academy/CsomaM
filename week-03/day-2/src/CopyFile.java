// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        System.out.println(copy("asd.txt", "asd2.txt"));
    }

    static boolean copy(String start, String finish) {
        boolean succes = true;
        File source = new File(start);
        File destination = new File(finish);
        try {
            Files.copy(source.toPath(), destination.toPath());
        } catch (IOException e) {
            succes = false;
        }
        return succes;
    }
}