package JavaDay2.Assignment;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Prasoon on 13/7/17.
 */
public class VampireNumberTest {
    @Test
    public void numOfDigits() throws Exception {
        VampireNumber ins1= new VampireNumber();
        assertEquals(4,ins1.numOfDigits(1260));
    }

    @Test
    public void sortString() throws Exception {
        VampireNumber ins2= new VampireNumber();
        assertEquals(1,ins2.checkPrintVampire(1260));
    }

    @Test
    public void checkPrintVampire() throws Exception {
        VampireNumber ins3= new VampireNumber();
        assertEquals("1234",ins3.sortString("3241"));
    }

}