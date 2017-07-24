package Day7Java;

/**
 * Creating a Single node
 * Created by Prasoon on 19/7/17.
 */
public class SListNode<T> {
    T element;

    SListNode<T> next;

    /**
     * Constructor when only element is given
     * @param element which is the element contained in a single node
     */
    public SListNode(T element) {
        this.element = element;
        this.next= null;
    }

    /**
     * Constructor when element and next node is given
     * @param element which is element contained in a single node
     * @param next gives the next node after the current node
     */
    public SListNode(T element, SListNode<T> next) {
        this.element = element;
        this.next = next;

    }

    /**
     * To print a element of node if it contains some Value.
     * @return the element contained for printing
     */
    public String toString(){
        if (element==null){
            return "null";
        }
        return element.toString();
    }
}
