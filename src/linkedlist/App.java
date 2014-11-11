package linkedlist;

import java.util.Arrays;

/**
 * @author Kevin Duraj 
 * @DataStructure Store LinkedList in sorted order 
 * @Complexity O(n)
 */
public class App {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        int[] array1 = {3, 1, 5, 0};
        int[] array2 = {2, 8, 1};

        for (int i = 0; i < array1.length; i++) {
            list.addInOrder(array1[i]);
        }
        for (int i = 0; i < array2.length; i++) {
            list.addInOrder(array2[i]);
        }

        System.out.println("input array1 = " + Arrays.toString(array1));
        System.out.println("input array2 = " + Arrays.toString(array2));
        System.out.println("------------------------------------");
        System.out.print("output linked list = ");
        System.out.print(list);
        System.out.println("------------------------------------");
        System.out.println("Remove Index 3");
        list.remove(3);
        System.out.print(list);
        System.out.println();
    }

}
