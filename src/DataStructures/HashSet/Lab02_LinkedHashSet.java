/*
1. It is exactly same as HashSet, the only difference is it follows insertion order but HashSet does not follow
insertion order.
2. It stores heteregenous data
3. It can store null
 */

package DataStructures.HashSet;

import java.util.LinkedHashSet;

public class Lab02_LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet lhs=new LinkedHashSet();
        lhs.add("ATB");
        lhs.add("Java");
        lhs.add("Git");
        lhs.add(1);
        lhs.add(null);

        System.out.println(lhs);

    }
}
