package linkedlist;

/**
 * @author Kevin Duraj
 * Store LinkedList in sorted order
 */
public class LinkedList {

    private Node head;
    private int size;

    /*--------------------------------------------------------------------------------------------*/
    public LinkedList() {

        head = new Node(null);
        size = 0;
    }
    /*--------------------------------------------------------------------------------------------*/
    public void add(Object data, int index) 
    {
        Node temp = new Node(data);
        Node current = head;

        for (int i = 1; i < index && current.getNext() != null; i++) {
            current = current.getNext();
        }

        temp.setNext(current.getNext());
        current.setNext(temp);
        size++;
    }
        
    /*--------------------------------------------------------------------------------------------*/
    public Object get(int index) 
    {
        if (index <= 0) {
            return null;
        }

        Node current = head.getNext();
        for (int i = 1; i < index; i++) {
            if (current.getNext() == null) {
                return null;
            }

            current = current.getNext();
        }
        return current.getData();
    }

    /*--------------------------------------------------------------------------------------------*/
    public void addInOrder(int val) {

        int index = 0;
        int last = 0;
        boolean found = false;

        if (size == 0) {
            add(val, 1);
        } else {

            for (int i = 1; i <= size; i++) {

                int temp = (int) get(i);

                if (val < temp) {
                    index = i;
                    found = true;
                    break;
                } 
                last=i;
            }
            
            if(found) add(val, index);
            else add(val, last+1);      
        }
    }
    /*--------------------------------------------------------------------------------------------*/
}
