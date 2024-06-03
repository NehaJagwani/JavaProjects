package DataStructures.TreeMap;


import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.TreeMap;

public class TreeMap_01 {
    public static void main(String[] args) {
        Map tm1 = new TreeMap();
        tm1.put(500, "Neha");
        tm1.put(400, "Sahil");

        //Print using the Set and Iterator, this will print in 1 line
        Set set1=tm1.entrySet();
        Iterator itr1=set1.iterator();
        while(itr1.hasNext())
        {
            System.out.println(itr1.next());
        }

        //Print using the Set and Iterator using the Map.Entry interface
        Set set2=tm1.entrySet();
        Iterator itr2=set2.iterator();
        while(itr2.hasNext())
        {
            Map.Entry element=(Map.Entry) itr2.next();
            System.out.println(element.getKey()+" : "+element.getValue());
        }
    }
}
