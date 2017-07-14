package JavaDay2.Assignment;

/**
 * Created by Prasoon on 13/7/17.
 */
public class SecondPart {
    int number1;
    int number2;

    SecondPart(int num1){
        number2=num1;
        System.out.println("Constructor 1 number2= "+ number2);
    }


    SecondPart(){
        number1=5;
        new SecondPart(number1);
        System.out.println("Constructor 2 number1= "+ number1);
    }


    public static void main(String[] args) {
        new SecondPart();

    }
}
