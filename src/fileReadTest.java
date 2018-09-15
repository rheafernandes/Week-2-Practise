import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class fileReadTest {
    fileRead testObj;
    @Before
    public void setUp() throws Exception {
        testObj=new fileRead();
    }

    @After
    public void tearDown() throws Exception {
        testObj=null;
    }
    @Test
    public void readFile() {
        boolean expected=true;
        boolean actual=false;
        try {
            actual = testObj.readFile("/home/niit/Java/JAVA PRACTICE 2/src/PE4");
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(expected,actual);
        expected=false;
        try {
            actual = testObj.readFile("/home/niit/Java/JAVA PRACTICE 2/src/PE4FALSE");
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(expected,actual);
    }
}