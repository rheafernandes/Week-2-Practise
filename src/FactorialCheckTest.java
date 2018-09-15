import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialCheckTest {
    FactorialCheck testObj;
    @Before
    public void setUp() throws Exception {
        testObj=new FactorialCheck();
    }

    @After
    public void tearDown() throws Exception {
        testObj=null;
    }

    @Test
    public void printFact() {
        testObj.printFact();

    }

    @Test
    public void getFactorial() {
        int expected=6;
        int actual=testObj.getFactorial(3);
        assertEquals(expected,actual);
    }
}