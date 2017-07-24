package Day7Java;

/**
 * An Iterator for a singly Linked list to move from element to element and to
 * perform insertion or removing of element.
 * Created by Prasoon on 19/7/17.
 */
public class SListIterator <T> {
    SListNode<T> cursor;
    SListNode<T> cursor1;

    /**
     * Constructor for creating an iterator
     * @param cursor for pointing a specific node in the list
     */
    public SListIterator(SListNode<T> cursor) {
        this.cursor = cursor;
    }

    /**
     * Method for Insertion of Node containing Element in List.
     * @param element the element to be inserted in the list.
     */
    public void insert(T element){
        cursor.next= new SListNode<T>(element,cursor.next);
        cursor1=cursor;
        cursor=cursor.next;
    }

    /**
     * Method for removing the node.
     * @param head gives the head of the node to the cursor.
     */
    public void remove(SListNode head){
        SListNode cursor2 =head;
        if (cursor2.next!=null){
            while (cursor2.next.next !=null){
                cursor2=cursor2.next;
            }
            cursor2.next=null;
        }
    }

    /**
     * check whether the node on which cursor is has any next node or not.
     * @return returns 1 or 0 depending on whether there is an next node or not
     */
    public Boolean hasNext(){
        return cursor.next!=null;
    }

    /**
     * moves te cursor to the next node
     * @return returns the cursor after moving it to the next node
     */
    public SListNode<T> next(){
        cursor=cursor.next;
        return cursor;
    }
}
