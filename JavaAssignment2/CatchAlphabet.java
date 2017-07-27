package JavaAssignment2;

import java.util.HashMap;
import java.util.Map;

/**
 * Class containing a method for checking whether the string contains all the alphabets
 * Created by Prasoon on 24/7/17.
 */
public class CatchAlphabet {
    /**
     * Time complexity - O(n)
     * Space complexity- O(n)
     * where n is length of the string
     */

    /**
     * A method to check whether the string contains all the alphabet a-z (case insensitive).
     *
     * @param str string given as input by user
     * @return boolean true or false true if the function contains all alphabets otherwise false.
     */
    public Boolean checkForAlphabet(String str) {

        Boolean value = true;
        String str1 = str.toLowerCase();

        Boolean[] array = new Boolean[26];

        if (str1.length()>= 26){
            for (int k = 0; k < 26; k++) {
                array[k] = false;
            }

            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z') {
                    array[str1.charAt(i) - 'a']= true;
                }
            }

            for (int j = 0; j < 26; j++) {
                if (array[j] == false) {
                    value = false;
                }
            }
        }
        else value= false;

        return value;
    }
}