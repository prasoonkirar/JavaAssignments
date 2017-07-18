package Day3Java.AssignmentPart5;

/**
 * Created by Prasoon on 17/7/17.
 */
public class Mail {
    static class file extends Courier.Document{
        file(Courier obj1){
            obj1.super("DOCUMENT");
        }
    }

    public static void main(String[] args) {
        Courier blueDart= new Courier();
        file ticket= new file(blueDart);
    }
}
