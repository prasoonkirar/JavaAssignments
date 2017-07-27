package JavaAssignment1;

import mytests.FindFile;

import java.io.File;
import java.util.Scanner;

/**
 * Main class to run the main function that takes input repeatedly
 * and print the absolute path of file matched
 * Created by Prasoon on 24/7/17.
 */
public class Main {
    public static void main(String[] args) {
        FileNameMatch file1 = new FileNameMatch();
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int flag = 0;


        while (flag == 0) {
            boolean value=false;
            try {
                System.out.println("Choose Option...");
                System.out.println("1. Match Files");
                System.out.println("2. Exit\n");
                int choice = sc2.nextInt();
                if (choice == 2) {
                    flag = 1;
                } else if (choice == 1) {
                    System.out.println("\nEnter the Regular Expression which is to be matched ");
                    String regex = sc1.next();
                    String directory = "/home";
                    value = file1.matchPrintFile(regex, new File(directory),value);

                }
                else throw new CustomException1("Error wrong choice please select 1 or 2.");
                System.out.println("\n");
            }catch (CustomException1 m){
                System.out.println("Error exception occurred" +m +"\n\n");
            }
            if ((value == false)&&(flag!=1)){
                System.out.println("File matching the pattern not found.\n");
            }
        }
        System.out.println("Exiting!! Thank you...!!!");
    }
}
