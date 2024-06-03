package DataStructures.Comparison;

import java.util.TreeSet;

public class Lab03_TreeSet {
    public static void main(String[] args) {
        TreeSet ts1=new TreeSet();
        //TreeSet cannot store heteregenous data
        //TreeSet follows the sorting order
        //TreeSet does not follow the insertion order
        //TreeSet cannot store duplicate values
        //TreeSet cannot store null at all
        System.out.print("TreeSet1: ");
        ts1.add(30);
        ts1.add(15);
        ts1.add(15);
       // ts1.add(null); -> this will throw NullPointerException
        System.out.println(ts1);
    }
}
