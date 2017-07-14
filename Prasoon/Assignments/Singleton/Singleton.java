package Prasoon.Assignments.Singleton;

/**
 * Created by Prasoon on 12/7/17.
 */
public class Singleton {
    String s;

    public static Singleton initializeString(String a){
        Singleton object= new Singleton();
        object.s =a;

        return object;
    }

    public void printString(){
        System.out.println(s);
    }
}
