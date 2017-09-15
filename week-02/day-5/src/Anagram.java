import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me 2 strings and I'll compare them and tell you if they are anagrams.");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if (anagram(s1, s2) == true){
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

    static boolean anagram (String s1, String s2) {
        boolean anagram;
        s1.replaceAll("\\W","");
        s2.replaceAll("\\W","");
        if (s1.length() == s2.length()) {
            String[] sa1 = "s1".split("");
            String[] sa2 = "s2".split("");
            Arrays.sort(sa1);
            Arrays.sort(sa2);
            int i = 0;
            do {
                if (sa1[i].equals(sa2[i])) {
                    anagram = true;
                } else {
                    anagram = false;
                } i++;
            } while (i < sa1.length);
        } else {
            anagram = false;
        }
        return (anagram);
    }
}
