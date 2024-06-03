package DataStructures.Comparison;

import com.sun.source.tree.Tree;

import java.util.TreeMap;

public class Lab05_TreeMap {
    public static void main(String[] args) {
        //TreeMap stores data in the form of Key-value pairs, keys needs to be homegenous, values can be heteregenous
        //Follows the sorting order with respect to the keys, keys will be sorted
        //Does not follow the insertion order
        //Cannot store nulls at all neither in key nor in value

        TreeMap tm1=new TreeMap();
        System.out.print("TreeMap1: ");
        tm1.put(102, "Neha");
        tm1.put(101, "Kyra");
        tm1.put(99, "Raghu");
        tm1.put(103,"Sheetal");

        //Keys cannot be null, will throw NullPointerException
       // tm1.put(null, "Sahil");

        //Values cannot be null, will throw NullPointerException
        //tm1.put(11, null);

        System.out.println(tm1);

        //Values can be heteregenous, keys will always be homogenous
        TreeMap tm2=new TreeMap();
        System.out.print("TreeMap2: ");
        tm2.put(101, "Neha");
        tm2.put(102, 103);
        System.out.println(tm2);

        //Values can be heteregenous, keys will always be homogenous
        TreeMap tm3=new TreeMap();
        tm3.put("Neha", 101);
        tm3.put("Raghu", 102);
        System.out.println(tm3);
    }
}
