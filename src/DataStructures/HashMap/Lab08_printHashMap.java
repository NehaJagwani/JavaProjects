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
        HashMap<Integer, String> h9=new HashMap();
        h9.put(101, "Neha");
        h9.put(202, "Kyra");
        //Print using the SOP statement
       // System.out.println(h9);

        //Print using Set and Iterator, it will print items in a different line
        Set set=h9.entrySet();
        Iterator itr=set.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        //Print using the for each loop. To print using the foreach loop for Map, you need to use the Map interface.
        //This is used when you want to print customized characters between key and value.
        for(Map.Entry<Integer, String> element: h9.entrySet())
        {
            System.out.println(element.getKey()+" : "+element.getValue());
        }

        //Alternate way to print using the Map interface.
        //This is used when you want to print customized characters between key and value.
        Set set1=h9.entrySet();
        Iterator itr1=set1.iterator();
        while(itr1.hasNext())
        {
            Map.Entry entry=(Map.Entry) itr1.next();
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}
