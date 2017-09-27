import java.util.Arrays;

public class Anagram {

    String s1;
    String s2;

    public Anagram(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public boolean isAnagram () {
        char[] w1 = s1.replaceAll("[\\s]", "").toCharArray();
        char[] w2 = s2.replaceAll("[\\s]", "").toCharArray();
        Arrays.sort(w1);
        Arrays.sort(w2);
        return Arrays.equals(w1, w2);
    }
}
