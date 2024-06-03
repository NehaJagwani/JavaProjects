//For Maps,
//a. You can print using the Set and Iterator interface.
//b. You can also print using the Map interface.

package DataStructures.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

public class Lab12_printHashMap_Set_Iterator_MapInterface {
    public static void main(String[] args) {
        HashMap hm1=new HashMap();
        hm1.put(101, "Science");
        hm1.put(102, "Maths");

        Set set1=hm1.entrySet();
        Iterator itr1=set1.iterator();
        while(itr1.hasNext())
        {
            System.out.println(itr1.next());
        }

        //Use Map interface if you want to print customized character between key and the value.
        Set set2=hm1.entrySet();
        Iterator itr2=set2.iterator();
        while(itr2.hasNext())
        {
            Map.Entry element=(Map.Entry) itr2.next();
            System.out.println(element.getKey()+" : " +element.getValue());
        }
    }
}
