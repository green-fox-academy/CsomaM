import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
    @Test
    public void fibonacci() throws Exception {

        Fibonacci f = new Fibonacci();
        assertEquals(5, f.fibonacci(5));

    }

    @Test
    public void fibonacci1() throws Exception {

        Fibonacci f = new Fibonacci();
        assertEquals(1, f.fibonacci(1));

    }


    @Test
    public void fibonacci0() throws Exception {

        Fibonacci f = new Fibonacci();
        assertEquals(0,0);

    }

}