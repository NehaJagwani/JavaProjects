package DataStructures.Comparison;

import java.util.HashMap;

public class Lab04_HashMap {
    public static void main(String[] args) {

        //HashMap stores data in the form of key-value pairs.
        //HashMap stores heteregenous data. keys and values both can be heteregenous
        //Keys cannot be duplicate, but the values can be duplicate
        //Key can have 1 null, but there can be multiple null values
        //Does not follow insertion and sorting order

        HashMap hm1=new HashMap();
        System.out.print("HashMap1: ");
        hm1.put(101, "Neha");
        hm1.put(102, "c");

        //Keys cannot be duplicate
        hm1.put(102, "Kyra");

        //Values can be dupliate
        hm1.put(103, "Neha");

        //Can store just 1 null key
        hm1.put(null, "Raghu");
        System.out.println(hm1);

        //Can have multiple null values
        hm1.put(104, null);
        hm1.put(105, null);
        System.out.println(hm1);

        //Does not follow insertion and sorting order, the keys will not be sorted
        HashMap hm2=new HashMap();
        System.out.print("HashMap2: ");
        hm2.put(99, "Neha");
        hm2.put(102, "Kyra");
        hm2.put(95,"Aman");
        hm2.put(106,"Zeenat");
        System.out.println(hm2);

        //Keys always need to be homogenous, values can be heteregenous
        System.out.print("HashMap3: ");
        HashMap hm3=new HashMap();
        hm3.put(101, "Neha");
        hm3.put("Raghu", "Sheena");
        hm3.put('c', 108);
        System.out.println(hm3);
    }
}
