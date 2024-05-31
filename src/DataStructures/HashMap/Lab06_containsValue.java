package DataStructures.HashMap;

import java.util.HashMap;

public class Lab06_containsValue {
    public static void main(String[] args) {
        HashMap hm6=new HashMap();
        hm6.put(101,"Neha");
        hm6.put(102,"Kyra");
        System.out.println(hm6.containsValue("Neha"));
        System.out.println(hm6.containsValue("Raghu"));
    }
}
