package JavaAssignment3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Prasoon on 25/7/17.
 */
public class PingMedianTimeTest {

    @Test
    public void printMedian() throws Exception {
        PingMedianTime param2=new PingMedianTime();
        List<Double> array=new ArrayList<>();
        array.add(Double.parseDouble("1"));
        array.add(Double.parseDouble("2"));
        array.add(Double.parseDouble("3"));
        assertEquals("2.0",Double.toString(param2.printMedian(array)));
    }

}