import java.util.ArrayList;
import java.util.HashMap;

public class CountLetters {

    String s;

    public CountLetters(String s) {
        this.s = s;
    }

    public HashMap<Character, Integer> makeDictionary () {
        char[] input = s.toCharArray();
        HashMap<Character, Integer> dictionary = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            if (!dictionary.containsKey(input[i])) {
                dictionary.put(input[i], 1);
            } else {
                dictionary.put(input[i], dictionary.get(input[i]) + 1 );
            }
        }
        return dictionary;
    }
}
