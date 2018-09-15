import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenCheckTest {
    EvenCheck testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new EvenCheck();
    }

    @After
    public void tearDown() throws Exception {
        testObj = null;
    }

    @Test
    public void isEven() {
        boolean expected = true;
        boolean actual = testObj.isEven(34);
        assertEquals(expected, actual);
        expected = false;
        actual = testObj.isEven(23);
        assertEquals(expected, actual);
    }
}