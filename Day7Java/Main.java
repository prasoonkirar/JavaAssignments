package Day7Java;
import java.util.Scanner;

/**
 * Created by Prasoon on 19/7/17.
 */
public class Main {
    public static void main(String[] args) {

        int choice=0;
        SList<String> listElem= new SList<>();
        System.out.println(listElem);

        SListIterator<String> sListIter= listElem.iterator();
        Scanner sc = new Scanner(System.in);
        Scanner sc1= new Scanner(System.in);
        System.out.println("Enter your choice: \n" +
                "1. Inserting Element in List\n" +
                "2. Removing Element from List\n" +
                "3. Exit \n");
        do {
            System.out.println("Choice??????\n");
             choice=sc.nextInt();
            try {
                if (choice == 1) {
                    System.out.println("Enter the word to Insert");
                    String str = sc1.nextLine();
                    sListIter.insert(str);
                    System.out.println("Inserting \n");
                    System.out.println(listElem);
                    System.out.println("\n");
                }
                else {
                    if (choice == 2) {
                        System.out.println("Removing...\n");
                        sListIter.remove(listElem.head);
                        System.out.println(listElem);
                        System.out.println("\n");
                    }
                    else if (choice!=3) throw new CustomException1("Wrong choice Input please correct...");
                }
            }catch (CustomException1|NullPointerException m){
                System.out.println("Error Exception occurred" +m);
            }
        }while (choice !=3);

        System.out.println("Exit..!!!");
    }
}
