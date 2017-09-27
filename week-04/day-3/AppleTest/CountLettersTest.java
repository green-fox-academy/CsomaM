import org.junit.Test;

import static org.junit.Assert.*;

public class CountLettersTest {
    @Test
    public void makeDictionary() throws Exception {
        CountLetters test = new CountLetters("kappa");
        assertEquals("{p=2, a=2, k=1}" , test.makeDictionary().toString());
    }

}