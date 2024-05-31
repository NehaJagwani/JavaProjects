//In get(), you need to provide the key to retrieve its corresponding value.
//The syntax is get(key).

package DataStructures.HashMap;

import java.util.HashMap;

public class Lab03_get {
    public static void main(String[] args) {
        HashMap hm2=new HashMap();
        hm2.put(101, "Neha");
        hm2.put(102, "Raghu");
        System.out.println(hm2.get(101));
    }
}
