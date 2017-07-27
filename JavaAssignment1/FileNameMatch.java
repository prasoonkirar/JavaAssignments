package JavaAssignment1;

import java.io.File;
import java.util.regex.*;

/**
 * class to match the filename with a specific pattern or regular expression input by user
 * Created by Prasoon on 24/7/17.
 */
public class FileNameMatch {

    /**
     * A method which prints the file name along with the path which matches the Regular expression
     * @param regex  input pattern string which is to be matched
     * @param file path name or directory name (i.e. /home given as according to problem)
     * @param value1 a boolean value true or false depending on file found or not
     * @return it returns true or false depending on whether any file name in the computer
     * matches th regular expression
     */
    public Boolean matchPrintFile(String regex,File file,Boolean value1) {

        File[] list = file.listFiles();
        if (list != null) {
            for (File fil : list) {
                if (fil.isDirectory()) {
                   value1 = matchPrintFile(regex, fil,value1);
                } else if (Pattern.matches(regex, fil.getName())) {
                    System.out.println(fil.getParentFile() + "/" + fil.getName());
                    value1=true;
                }
            }
        }
        return value1;
    }
}
