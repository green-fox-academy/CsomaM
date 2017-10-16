import org.junit.Test;

import static org.junit.Assert.*;

public class GameMechanicsTest {

    @Test
    public void highestCard() throws Exception {
        GameMechanics gm = new GameMechanics();
        String[] input = new String[]{"2H","3D","5S","9C","KD"};
        Hand white = new Hand(input);
        assertEquals("KD", gm.highestCard(white));
    }

    @Test
    public void checkPairs() throws Exception {
        GameMechanics gm = new GameMechanics();
        String[] input = new String[]{"2H","3D","2S","9C","KD"};
        Hand white = new Hand(input);
        assertEquals("[2H, 2S]", gm.checkMultiple(white).toString());
    }

    @Test
    public void pairNum() throws Exception {
        GameMechanics gm = new GameMechanics();
        String[] input = new String[]{"2H","3D","2S","9C","KD"};
        Hand white = new Hand(input);
        assertEquals(true, gm.checkPairs(white));
    }

    @Test
    public void pairNum2() throws Exception {
        GameMechanics gm = new GameMechanics();
        String[] input = new String[]{"2H","3D","2S","3C","KD"};
        Hand white = new Hand(input);
        assertEquals(true, gm.checkPairs(white));
    }

    @Test
    public void pairNum3() throws Exception {
        GameMechanics gm = new GameMechanics();
        String[] input = new String[]{"4H","3D","2S","5C","KD"};
        Hand white = new Hand(input);
        assertEquals(false, gm.checkPairs(white));
    }

    @Test
    public void pairNum4() throws Exception {
        GameMechanics gm = new GameMechanics();
        String[] input = new String[]{"4H","4D","4S","2C","KD"};
        Hand white = new Hand(input);
        assertEquals(false, gm.checkPairs(white));
    }

    @Test
    public void checkTriple() throws Exception {
        GameMechanics gm = new GameMechanics();
        String[] input = new String[]{"4H","4D","6S","5C","5D"};
        Hand white = new Hand(input);
        assertEquals(false, gm.checkTriple(white));
    }

    @Test
    public void checkDouble() throws Exception {
        GameMechanics gm = new GameMechanics();
        String[] input = new String[]{"4H","4D","4S","5C","5D"};
        Hand white = new Hand(input);
        assertEquals(true, gm.checkTriple(white));
    }

    @Test
    public void checkStraight() throws Exception {
        GameMechanics gm = new GameMechanics();
        String[] input = new String[]{"9H","TH","JS","QC","KD"};
        Hand white = new Hand(input);
        assertEquals(true, gm.checkStraight(white));
    }

}