package DataStructures.ArrayList;

import java.util.ArrayList;

public class Lab15_indexOf {
    public static void main(String[] args) {
        ArrayList al17=new ArrayList();
        al17.add("Neha");
        al17.add("Raghu");
        System.out.println(al17.indexOf("Raghu"));

        al17.add(17);
        System.out.println(al17.indexOf(17));
    }
}
