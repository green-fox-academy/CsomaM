import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {
    @Test
    public void getSum() throws Exception {
        ArrayList<Integer> sum = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            sum.add(i+1);
        }
        Sum test = new Sum(sum);
        assertEquals(15, test.getSum());
    }
}
