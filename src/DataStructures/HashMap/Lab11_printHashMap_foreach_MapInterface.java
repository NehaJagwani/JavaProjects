//If you want to print using the foreach loop for HashMap/TreeMap, use the Map.Entry interface

package DataStructures.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Lab11_printHashMap_foreach_MapInterface {
    public static void main(String[] args) {
        HashMap<Object, Object> hm1=new HashMap();
        hm1.put(101,"Neha");
        hm1.put("Raghu", 102);

        for(Map.Entry<Object, Object> element:hm1.entrySet())
        {
            System.out.println(element.getKey()+" : "+element.getValue());
        }

        HashMap<Integer, String> hm2=new HashMap();
        hm2.put(101, "Science");
        hm2.put(99, "Maths");
        for (Map.Entry<Integer, String> element:hm2.entrySet())
        {
            System.out.println(element.getKey()+" : "+element.getValue());
        }
    }
}
