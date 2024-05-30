/*
Properties of a LinkedList: Properties are exactly the same as that of an ArrayList
1. ArrayLIst areindex based structure.
2. Arraylist can store data of different data types i.e. it can store heteregenous data.
3. Arraylist can store duplicate values.
4. Arraylist can store any number of null values.
5. Arraylist follows insertion order.
6. ArrayList are non-synchronized.
 */

package DataStructures.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Lab01_LinkedListProperties {
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        l1.add("Neha");
        l1.add("Kyra");
        System.out.println(l1);

        Iterator itr=l1.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
