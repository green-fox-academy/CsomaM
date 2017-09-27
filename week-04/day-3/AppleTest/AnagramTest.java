import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
    @Test
    public void isAnagram() throws Exception {
        Anagram ana = new Anagram("acab", "baac");
        assertTrue(ana.isAnagram());
    }

    @Test
    public void isAnagram2() throws Exception {
        Anagram ana2 = new Anagram("abba", "madam");
        assertFalse(ana2.isAnagram());
    }

}