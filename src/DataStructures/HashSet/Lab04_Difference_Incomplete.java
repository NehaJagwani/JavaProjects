/* Difference
1. The mostly used is HashSet in API and Selenium.
*/

package DataStructures.HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Lab04_Difference_Incomplete {
    public static void main(String[] args) {
        HashSet hs1=new HashSet();
        hs1.add("Neha");
        hs1.add(1);
        System.out.println(hs1);

        LinkedHashSet lhs1=new LinkedHashSet();
        lhs1.add("neha");
        lhs1.add(1);
        System.out.println(lhs1);

        TreeSet ts1=new TreeSet();
    }
}
