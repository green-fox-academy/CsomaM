import org.junit.Test;

import static org.junit.Assert.*;

public class HandTest {
    @Test
    public void getHand1() throws Exception {
        String[] input = new String[]{"2H","3D","5S","9C","KD"};
        Hand white = new Hand(input);
        assertEquals("3D", white.hand.get(1).getCard());
    }

    @Test
    public void getHand2() throws Exception {
        String[] input = new String[]{"2H","3D","5S","9C","KD"};
        Hand white = new Hand(input);
        assertEquals("2H 3D 5S 9C KD", white.handOut());
    }

}