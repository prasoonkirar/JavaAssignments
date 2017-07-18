package Day5Java;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Prasoon on 17/7/17.
 */
public class RegularExpressionTest {
    @Test
    public void regularEx() throws Exception {
        RegularExpression obj1= new RegularExpression();
        assertEquals(true,obj1.regularEx("Asian."));
        assertEquals(false,obj1.regularEx("asdfsg."));
        assertEquals(false,obj1.regularEx("asdfsg"));

    }

}