// Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".
import java.util.Scanner;

public class String3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a string");
        String s = sc.nextLine();
        System.out.println(addStar(s));
    }

    static String addStar(String s)
    {
        if (s.length() == 0) {
            return s;
        }
        String prefix = s.startsWith("") ? ( s.charAt(0) +"*") : s.substring(0, 1);
        return prefix + addStar(s.substring(1));
    }
}