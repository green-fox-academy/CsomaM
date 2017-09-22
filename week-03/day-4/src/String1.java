// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.

import java.util.Scanner;

public class String1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a string");
        String s = sc.nextLine();
        System.out.println(replaceChar(s));
    }

    static String replaceChar(String s) {
            if (s.length() == 0) {
                return s;
            } else {
                String prefix = s.startsWith("x") ? "y" : s.substring(0, 1);
                return prefix + replaceChar(s.substring(1));
            }
    }
}