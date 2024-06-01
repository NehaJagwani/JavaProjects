//Use keyset() to retrieve only keys, use values() to retrieve only values.

package DataStructures.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Lab10_keySet_values {
    public static void main(String[] args) {
        HashMap<String, Object> hm=new HashMap();
        hm.put("name", "neha");
        hm.put("rollno", 123);
        System.out.println(hm.keySet());
        System.out.println(hm.values());

        for(Map.Entry<String, Object> element: hm.entrySet())
        {
            System.out.println(element.getKey()+" : "+element.getValue());
        }
    }
}
