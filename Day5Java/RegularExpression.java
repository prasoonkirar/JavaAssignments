package Day5Java;

import java.util.regex.*;
import java.util.Scanner;

/** REGULAR EXPRESSION
 * It checks whether the given string matches the regular expression or not.
 * Created by Prasoon on 17/7/17.
 */
public class RegularExpression {

    /**
     * regularEx takes a string as a parameter and checks whether the entered
     * string matches the Pattern as required and return true or false
     * @param str takes a String as an input
     * @return returns true or false depending on the regular expression
     * matches then string parameter.
     */
    static Boolean regularEx(String str){
        return (Pattern.matches("[A-Z].*[.]",str));
    }

    public static void main(String[] args) {

        System.out.println("Enter the string to check whether it matches th expression or not.");
        Scanner sc= new Scanner(System.in);
        String str1= sc.nextLine();
        System.out.println(regularEx(str1));

    }
}
