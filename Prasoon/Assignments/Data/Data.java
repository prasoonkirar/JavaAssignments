package Prasoon.Assignments.Data;

/**
 * Created by Prasoon on 12/7/17.
 */
public class Data {
    int a;
    char b;

    public void printValues1(){
        System.out.println(a);
        System.out.println(b);
    }


     public void printValues2(){
         int x;
         int y;
         // System.out.println(x);
         // System.out.println(y);
     }
    /** The second method above that is printValues2() defining
     * it like that is not possible in java as the initialization of
     * parameters x and y is not done and as they are not field of a
     * class so default initialization doesn't apply on them. So inorder
     * to make this work we need to initialize x and y in that method.
     *
     */


}

