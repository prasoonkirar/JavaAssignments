package Day3Java.AssignmentPart3;

/**
 * Created by Prasoon on 16/7/17.
 */
public class Car extends Automobile implements InterfaceFour {

    public void tyre() {
        System.out.println("Tyres ");
    }


    public void steering() {
        System.out.println("Steering");
    }


    public void engine() {
        System.out.println("Engine");
    }


    public void brake() {
        System.out.println("Brake");
    }


    public void gate() {
        System.out.println("Side gates and hood");
    }


    public void gear() {
        System.out.println("Gears");
    }


    public void cars() {
        System.out.println("CARS");
    }


    /*
    Below are the required four methods for taking four interfaces as an argument.
     */

    void carOne(InterfaceOne controls){
        controls.steering();
    }

    void carTwo(InterfaceTwo movement){
        movement.tyre();
    }

    void carThree(InterfaceThree design){
        design.gate();
    }

    void carFour(InterfaceFour model){
        model.cars();
    }
}
