import org.junit.Test;

import static org.junit.Assert.*;

public class AClassTest {

    @Test
    public void testStringTest(){
        AClass aClass = new AClass("test");
        assertTrue("Equals strings.","tesst".equals(aClass.getTestString()));
    }

}