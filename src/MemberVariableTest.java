import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberVariableTest {
    MemberVariable testObject;
    @Before
    public void setUp() throws Exception {
        testObject=new MemberVariable();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void initDisplayVar() {
        assertNotNull(testObject);
        testObject.initDisplayVar("Rhea Fernandes",22,40000);
        assertNotNull(testObject);
        testObject.initDisplayVar("Sara Fernandes",1,0);
    }
}