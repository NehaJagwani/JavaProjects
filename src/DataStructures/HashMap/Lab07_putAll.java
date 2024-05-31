package DataStructures.HashMap;

import java.util.HashMap;

public class Lab07_putAll {
    public static void main(String[] args) {
        HashMap hm7=new HashMap();
        hm7.put(101, "Neha");
        hm7.put(102, "Kyra");

        System.out.println(hm7);

        HashMap hm8=new HashMap();
        hm8.putAll(hm7);
        System.out.println(hm8);
    }
}
