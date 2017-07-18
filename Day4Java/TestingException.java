package Day4Java;
import java.util.Scanner;

/**
 * Created by Prasoon on 17/7/17.
 */
public class TestingException {
    static void check(int num) throws CustomException1,CustomException2,CustomException3{
        if((num>0) && (num < 100))
            throw new CustomException1("Exception 1 :: not valid");
        if(num == 100)
            throw new CustomException2("Exception 2 :: not valid");
        if (num >100)
            throw new CustomException3("Exception 3 :: not valid");
    }

    public static void main(String[] args) {
        int number;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        number = sc.nextInt();

        try{
            check(number);
            if(number==0){
                throw new NullPointerException();
            }
        }catch (CustomException1 |CustomException2 | CustomException3 m){
            System.out.println("Exception Occurred" +m);
        }
        finally {
            System.out.println("Finally clause is executed ");
        }
        /*
        In this NullPointerException is not handled but then also finally clause is executed.
        We can write Exception in Catch to handle it.
         */

    }
}
