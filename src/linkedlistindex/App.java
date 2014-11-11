package linkedlistindex;

import java.util.Arrays;

public class App {

    static LinkedList list = new LinkedList();
    
    /*--------------------------------------------------------------------------------------------*/
    public static void storeSorted(int val) {

        int index = 0;
        int last = 0;
        boolean found = false;

        if (list.size() == 0) {
            list.add(val, 1);
        } else {

            for (int i = 1; i <= list.size(); i++) {

                int temp = (int) list.get(i);

                if (val < temp) {
                    index = i;
                    found = true;
                    break;
                } 
                last=i;
            }
            
            if(found) list.add(val, index);
            else list.add(val, last+1);
            
        }

    }
    /*--------------------------------------------------------------------------------------------*/
    public static void main(String[] args) {
        
        int[] array1 = {3,1,5,0};
        int[] array2 = {2,8,1};

        for(int i=0; i<array1.length; i++) {
            storeSorted(array1[i]);
        }
        for(int i=0; i<array2.length; i++) { 
            storeSorted(array2[i]);
        }        

        System.out.println("input array1 = " + Arrays.toString(array1));
        System.out.println("input array2 = " + Arrays.toString(array2));
        System.out.println("------------------------------------");
        System.out.print("output linked list = ");
        
        for (int i = 1; i <= list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();
    }
    /*--------------------------------------------------------------------------------------------*/    
}
