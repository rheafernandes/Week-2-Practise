import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class palCheckTest {
    palCheck testString;
    @Before
    public void setUp() throws Exception {
        testString=new palCheck();
    }

    @After
    public void tearDown() throws Exception {
        palCheck testString=null;
    }
    @Test
    public void checkPalindrome(){
//        arrange
        boolean expected=true;
//        act
        boolean actual=testString.checkPalindrome("malayalam");
//        assert
        assertEquals(expected,actual);
        expected=false;
        actual=testString.checkPalindrome("Stackroute");
        assertEquals(expected,actual);
        expected=false;
        actual=testString.checkPalindrome("This is me");
        assertEquals(expected,actual);
        expected=true;
        actual=testString.checkPalindrome("Madam Im Adam");//try Ma'am I'm Adam by removing special characters.
        assertEquals(expected,actual);

    }


}