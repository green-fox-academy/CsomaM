import java.util.*;
public class substr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence ="";
        String word ="";
        int index = 0;

        System.out.println("Give me a sentence.");
        sentence = sc.nextLine();

        System.out.println("Give me a word and I'll tell you if it's in the sentence.");
        word = sc.next();

        index = init(sentence,word);

        if (index != -1) {
            System.out.println("The word's starting index is: " + index);
        } else {
            System.out.println("The word is not in the sentence.");
        }
    }

    public static int init (String s1, String s2) {
        int index = 0;
        if (s1.contains(s2)) {
            index = s1.indexOf(s2);
        } else {
            index = -1;
        }
        return (index);
    }
}
