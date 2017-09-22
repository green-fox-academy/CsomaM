// Given a string, compute recursively a new string where all the 'x' chars have been removed.

import java.util.Scanner;

public class String2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a string");
        String s = sc.nextLine();
        System.out.println(removeChar(s));
    }

    static String removeChar(String s)
    {
        if (s.length() == 0) {
            return s;
        }
        String prefix = s.startsWith("x") ? "" : s.substring(0, 1);
        return prefix + removeChar(s.substring(1));
    }
}