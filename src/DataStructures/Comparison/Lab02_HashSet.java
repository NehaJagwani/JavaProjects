package DataStructures.Comparison;

import java.util.HashSet;

public class Lab02_HashSet {
    public static void main(String[] args) {
        HashSet hs1=new HashSet();

        //HashSet is not an index based structure, it stores data according to the hashcodes.
        //HashSet can store heteregenous data.
        //HashSet does not follow insertion order
        System.out.print("HashSet1: ");
        hs1.add(10);
        hs1.add("Kyra");
        hs1.add('c');
        hs1.add(100);
        System.out.println(hs1);

        //HashSet does not follow the sorting order
        HashSet hs2=new HashSet();
        System.out.print("HashSet2: ");
        hs2.add(1000);
        hs2.add(109);
        hs2.add(999);
        System.out.println(hs2);

        //HashSet cannot store duplicate values
        HashSet hs3=new HashSet();
        System.out.print("HashSet3: ");
        hs3.add(10);
        hs3.add(10);
        hs3.add(100);
        System.out.println(hs3);

        //HashSet can store just 1 null value since it cannot store duplicates
        HashSet hs4=new HashSet();
        System.out.print("HashSet4: ");
        hs4.add(null);
        hs4.add(null);
        System.out.println(hs4);

    }
}
