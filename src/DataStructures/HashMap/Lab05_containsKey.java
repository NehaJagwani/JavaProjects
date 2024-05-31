//containsKey() returns a boolean value.

package DataStructures.HashMap;

import java.util.HashMap;

public class Lab05_containsKey {
    public static void main(String[] args) {
        HashMap hm5=new HashMap();
        hm5.put(101,"Neha");
        hm5.put(102,"Kyra");
        System.out.println(hm5.containsKey(101));
        System.out.println(hm5.containsKey(105));
    }
}
