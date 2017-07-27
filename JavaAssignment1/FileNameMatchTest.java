package JavaAssignment1;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

/**
 * Created by Prasoon on 24/7/17.
 */
public class FileNameMatchTest {

    @Test
    public void matchPrintFile() throws Exception {
        FileNameMatch file1=new FileNameMatch();
        assertEquals(true,file1.matchPrintFile("hello.*", new File("/home"),false));
        assertEquals(false,file1.matchPrintFile("a*b",new File("/home"),false));
    }

}