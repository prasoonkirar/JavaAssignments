package JavaAssignment2;

import java.util.Scanner;

/**
 * Created by Prasoon on 24/7/17.
 */
public class Main {
    public static void main(String[] args) {

        Boolean value;
        CatchAlphabet catchAlpha= new CatchAlphabet();
        Scanner scan1= new Scanner(System.in);
        System.out.println("Enter the String to check whether it contains all alphabets or not ");
        String str= scan1.nextLine();
        value=catchAlpha.checkForAlphabet(str);
        if (value==true){
            System.out.println("\nString Contains all the alphabets a-z (case-insensitive)");
        }
        else System.out.println("\nString doesn't contain all alphabet");

    }
}
