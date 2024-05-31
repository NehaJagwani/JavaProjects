/*
1. Traditional for loop cannot be used to print HashMap
2. SOP statement will print HashMap values in a single line
3. Set interface will also print HashMap values in a single line. Use entryset(), see below
3. To print HashMap values one by one, use the iterator method, so first create a set object using the Set interface,
then print using the iterator().
4. Print using the Map interface.
*/

package DataStructures.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

public class Lab08_printHashMap {
    public static void main(String[] args) {
        HashMap h9=new HashMap();
        h9.put(101, "Neha");
        h9.put(202, "Kyra");
        //Print using the SOP statement
       // System.out.println(h9);

        //Print using the Set interface,it will print all the items in a single line
       /* Set set=h9.entrySet();
        System.out.println(set);*/

        //Print using the Iterator, it will print items in a different line
        Set set=h9.entrySet();
        Iterator itr=set.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        //Print using the Map interface
        Set set1=h9.entrySet();
        Iterator itr1=set1.iterator();
        while(itr1.hasNext())
        {
            Map.Entry entry=(Map.Entry) itr1.next();
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}
