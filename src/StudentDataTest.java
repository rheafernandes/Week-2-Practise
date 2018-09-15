import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class StudentDataTest {
    StudentData testObj;
    @Before
    public void setUp() throws Exception {
        testObj=new StudentData();
    }

    @After
    public void tearDown() throws Exception {
        testObj=null;
    }

    @Test
    public void average() {
        int num=6;
        int[] arrayNum={45,67,79,34,90,78};
        int expected =65;
        int actual= testObj.average(num, arrayNum);
        assertEquals(expected,actual);
    }

    @Test
    public void max() {
        int num=6;
        int[] arrayNum={45,67,79,34,90,78};
        int expected =90;
        int actual= testObj.max(num, arrayNum);
        assertEquals(expected,actual);
    }

    @Test
    public void min() {
        int num=6;
        int[] arrayNum={45,67,79,34,90,78};
        int expected =34;
        int actual= testObj.min(num, arrayNum);
        assertEquals(expected,actual);
    }
}