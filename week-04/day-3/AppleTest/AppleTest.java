import static org.junit.Assert.*;

public class AppleTest {
    @org.junit.Test
    public void getApple() throws Exception {
        Apple apple = new Apple("apple");
        assertEquals("apple", apple.getApple());
    }

}