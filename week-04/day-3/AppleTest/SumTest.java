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

    @Test
    public void getSum2() throws  Exception {
        ArrayList<Integer> sum = new ArrayList<>();
        Sum test = new Sum(sum);
        assertEquals(0, test.getSum());
    }

    @Test
    public void getSum3() throws  Exception {
        ArrayList<Integer> sum = new ArrayList<>();
        sum.add(1);
        Sum test = new Sum(sum);
        assertEquals(1, test.getSum());
    }

    @Test
    public void getSum4() throws  Exception {
        ArrayList<Integer> sum = null;
        Sum test = new Sum(sum);
        assertEquals(0, test.getSum());
    }
}
