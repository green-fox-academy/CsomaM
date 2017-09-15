import java.util.*;

public class PalindromeBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a string and I'll make it a palindrome.");
        String input = sc.nextLine();
        System.out.println(palGen(input));
    }

    static String palGen (String input) {
        String temp = new StringBuffer(input).reverse().toString();
        String palindrome = input + temp;
        return (palindrome);
    }
}
