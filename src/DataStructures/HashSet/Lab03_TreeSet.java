/*
Properties:
1. It is same as HashSet, the difference is that it follows sorting order. HashSet and LinkedHashSet does not follow
sorting order.
2. Null is not allowed
3. Duplicates are not allowed

*/

package DataStructures.HashSet;

import java.util.TreeSet;

public class Lab03_TreeSet {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet();
        ts.add(50);
        ts.add(20);
        ts.add(10);
        System.out.println(ts);
    }
}
