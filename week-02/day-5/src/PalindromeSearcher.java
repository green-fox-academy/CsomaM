import java.util.*;

public class PalindromeSearcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a string and I'll look for palindromes in it.");
        String input = sc.nextLine();
        palSearch(input);
    }

    static void palSearch(String input) {
        String s1 = "";
        int n = input.length();
        Set<String> palindromes = new HashSet<String>();
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                int k = i + j - 1;
                if (k >= n)
                    continue;
                s1 = input.substring(j, i + j);
                if (s1.equals(new StringBuilder(s1).reverse().toString())) {
                    palindromes.add(s1);
                }
            }
        }
        System.out.println(palindromes);
        for (String s : palindromes)
            System.out.println(s + " - is a palindrome string.");
        System.out.println("The no.of substring that are palindrome : "
                + palindromes.size());
    }
}
