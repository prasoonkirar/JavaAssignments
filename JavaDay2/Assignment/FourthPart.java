package JavaDay2.Assignment;

/**
 * Created by Prasoon on 13/7/17.
 */
public class FourthPart {

    FourthPart(String str1){
        System.out.println(str1);
    }

    public static void main(String[] args) {
        FourthPart[] objectReferenceArray= new FourthPart[5];
        /*
        In this if we are only creating the array of object reference then the constructor
         wont be called and the string won't be printed but if we create the object that is 
         if we remove the comments from the below for loop then the constructor is called and 
         then the string would be printed.

        for(int i=0; i<5; i++){
            objectReferenceArray[0]=new FourthPart("String Printing");
        }*/
    }
}
