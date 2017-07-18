package Day3Java.AssignmentPart1;

/**
 * Created by Prasoon on 16/7/17.
 */
public class Main {
    public static void main(String[] args) {
        Rodent[] arrayRodent = new Rodent[3];
        arrayRodent[0]=new Mouse();
        arrayRodent[1]=new Gerbil();
        arrayRodent[2]=new Hamster();
        for (int i=0;i<3;i++)
            arrayRodent[i].tail();
    }
}
