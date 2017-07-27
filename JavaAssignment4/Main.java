package JavaAssignment4;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Prasoon on 25/7/17.
 */
public class Main {
    public static void main(String[] args) {

        RangeKYC range=new RangeKYC();
        System.out.println("Enter the number of inputs to be passed");
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            Scanner sc1 = new Scanner(System.in);

            System.out.println("Enter the signup date and second date is the" +
                    " current date in format dd-mm-yyyy dd-mm-yyyy");

            String[] input=new String[n];

            for (int i=0; i< n ;i++) {
                input[i] = sc1.nextLine();
            }
            System.out.println("\n");
            for (int j=0;j<n;j++){
                range.printRangeKYC(input[j]);
            }

        }catch (Exception m){
            System.out.println("Error...!!! Wrong Input"+m);
        }
    }
}
