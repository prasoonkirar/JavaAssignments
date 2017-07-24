package Day7Java;

/**
 * Class for creating a singly link list and returning string for printing
 * Created by Prasoon on 19/7/17.
 */
public class SList<T> {


    SListNode<T> head = new SListNode<T>(null);

    /**
     *Method for creating constructor
     * @return it returns a new iterator with head as argument
     */
    SListIterator<T> iterator(){
        return new SListIterator<>(head);
    }

    /**
     * Creating a String of the entire singly Link list
     * @return entire link list as a string
     */
    public String toString() {
        if (head.next == null) {
            System.out.println("Linked List is empty");
            return "Linked List = []";
        }
        String str = " ";
        SListIterator<T> iterator1= this.iterator();

        while (iterator1.hasNext()){
            str += iterator1.next() + " , ";
        }
        return str +" ";
    }

}
