package JavaAssignment2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Prasoon on 24/7/17.
 */
public class CatchAlphabetTest {
    @Test
    public void checkForAlphabet() throws Exception {
        CatchAlphabet param1=new CatchAlphabet();
        assertEquals(true,param1.checkForAlphabet("qwertyuiopasdfghjklzxcvbnmqwerDFGBNZXCVBN"));
        assertEquals(false,param1.checkForAlphabet("asfjnnsjkvnds"));
    }

}