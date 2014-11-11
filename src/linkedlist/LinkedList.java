package linkedlist;

/**
 * @author Kevin Duraj 
 * @DataStructure Store LinkedList in sorted order 
 * @Complexity O(n)
 */
public class LinkedList {

    private Node head;
    private int size;

    /*--------------------------------------------------------------------------------------------
    LinkedList Constructor
    */
    public LinkedList() {

        head = new Node(null);
        size = 0;
    }
    /*--------------------------------------------------------------------------------------------
     Get Size of the LinkedList
     */

    public int getSize() {
        return size;
    }
    /*--------------------------------------------------------------------------------------------
     Add Node based on index 
     */

    public void add(Object data, int index) {
        Node temp = new Node(data);
        Node current = head;

        for (int i = 1; i < index && current.getNext() != null; i++) {
            current = current.getNext();
        }

        temp.setNext(current.getNext());
        current.setNext(temp);
        size++;
    }

    /*--------------------------------------------------------------------------------------------
     Get Node based on index
     */
    public Object get(int index) {
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

    /*--------------------------------------------------------------------------------------------
     Add Node into LinkedList in Sorted Order
     */
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
                last = i;
            }

            if (found) {
                add(val, index);
            } else {
                add(val, last + 1);
            }
        }
    }
    /*--------------------------------------------------------------------------------------------
     Remove Node from LinkedList based on index
     */

    public void remove(int pos) {

        if (pos == 1) {
            head = head.getNext();
            size--;
            return;
        }
        if (pos == size) {
            Node ptr = head;

            for (int i = 1; i < size - 1; i++) {
                ptr = ptr.getNext();
            }

            ptr.setNext(null);
            size--;
            return;
        }

        Node ptr = head;
        pos = pos - 1;
        for (int i = 1; i < size - 1; i++) {
            if (i == pos) {
                Node tmp = ptr.getNext();
                tmp = tmp.getNext();
                ptr.setNext(tmp);
                break;
            }
            ptr = ptr.getNext();
        }
        size--;
    }
    /*--------------------------------------------------------------------------------------------
     Override LinkedList Output
     */

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= size; i++) {
            sb.append(get(i)).append(" ");
        }
        return sb.toString().concat("\n");
    }
    /*--------------------------------------------------------------------------------------------*/
}
