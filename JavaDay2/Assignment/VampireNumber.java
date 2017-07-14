package JavaDay2.Assignment;
import java.util.*;

import static java.lang.Math.sqrt;

/**
 * VAMPIRE NUMBER
 *
 * This class prints the first 100 vampire number.
 *
 * Created by Prasoon on 13/7/17.
 */
public class VampireNumber {

    int number=1;

    /**
     * This method takes a number as an input and returns the count of number of digit in a number.
     * @param n n is any positive natural number.
     * @return count of number of digits in a number.
     */
    public int numOfDigits(int n){

        int count=0;
        for( ; n>0 ; n=n/10){
            count++;
        }
        return count;
    }

    /**
     * This method takes a String as an input and returns the sorted string in increasing manner.
     * @param str str is string variable.
     * @return returns the sorted (increasing order) string.
     */
    public String sortString(String str){
        char[] sortString= str.toCharArray();
        Arrays.sort(sortString);
        String sorted = new String(sortString);
        return sorted;
    }

    /**
     * This method takes a number as an input and checks whether the number is Vampire number or
     * not and if the number is vampire number it prints the number.
     * @param num num is any natural number.
     * @return it returns 1 if a vampire number is found otherwise returns 1.
     */
    public int checkPrintVampire(int num){
        int fang2= 0;
        int fang1 = (int)sqrt(num);

        int count=0;
        while(numOfDigits(fang1)== (numOfDigits(num)/2)){
            if ((num%fang1)==0){
                fang2=num/fang1;

                if((fang1%10!=0) || (fang2%10!=0)){
                    String str1=sortString(Integer.toString(num));
                    String str2=(Integer.toString(fang1))+(Integer.toString(fang2));
                    String str3=sortString(str2);
                    if(str1.equals(str3)){
                        System.out.println(fang1 + " * " + fang2 + " = " +num);
                        count=1;
                        break;
                    }
                }
            }
            --fang1;
        }

        return count;
    }

    public static void main(String[] args) {
        VampireNumber object1= new VampireNumber();
        object1.number=1260;
        int flag=0;

        while(flag<=99){
            flag += object1.checkPrintVampire(object1.number);
            ++object1.number;
        }
    }
}
