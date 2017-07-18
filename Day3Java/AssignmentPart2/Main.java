package Day3Java.AssignmentPart2;

/**
 * Created by Prasoon on 16/7/17.
 */
public class Main {
    public static void main(String[] args) {

        Cycle[] arrayCycles= { new Unicycle(),new Bicycle(), new Tricycle()};

        /**for (int i=0;i<3 ;i==)
         *arrayCycles[i].balance();
         *
         * Calling balance() on each elements will ive error as balance is not
         * defined in tricycle class and also not in the base class
         */

        ((Unicycle)arrayCycles[0]).balance(); //Downcasting
        ((Bicycle)arrayCycles[1]).balance(); //Downscating
    }

}
