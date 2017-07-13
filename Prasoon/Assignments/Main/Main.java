package Prasoon.Assignments.Main;
import Prasoon.Assignments.Data.Data;
import Prasoon.Assignments.Singleton.Singleton;

/**
 * Created by Prasoon on 12/7/17.
 */
public class Main {
    public static void main(String[] args) {

        Data object1=new Data();
        object1.printValues1();
        object1.printValues2();
        Singleton object2= Singleton.initializeString("JAVA");
        object2.printString();

    }
}
/**
 *object1.printValues2() doesn't run or give output as the variables inside
 * the method are not initialized as explained on Data.java so those wo print
 * commands have been commented
 *
 */