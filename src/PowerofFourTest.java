import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class PowerofFourTest {
    PowerofFour testObject;
    @Before
    public void setUp() throws Exception {
        testObject=new PowerofFour();
    }

    @After
    public void tearDown() throws Exception {
        testObject=null;
    }

    @Test
    public void powFour() {
        boolean expected=true;
        boolean actual=testObject.powFour(256);
        assertEquals(expected,actual);
        expected=false;
        actual=testObject.powFour(156);
        assertEquals(expected,actual);
        expected=true;
        actual=testObject.powFour(16384);
        assertEquals(expected,actual);
    }
//    @Test
//    public void powFour() {
//        boolean expected=true;
//        boolean actual=testObject.powFour(new BigInteger("256"));
//        assertEquals(expected,actual);
//        expected=false;
//        actual=testObject.powFour(new BigInteger("156"));
//        assertEquals(expected,actual);
//        expected=true;
//        actual=testObject.powFour(new BigInteger("1099511627776"));
//        assertEquals(expected,actual);
//    }
}