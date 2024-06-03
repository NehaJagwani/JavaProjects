package DataStructures.Comparison;

import java.util.ArrayList;

public class Lab01_ArrayList {
    public static void main(String[] args) {
        ArrayList al1=new ArrayList();

        //ArrayList can store heteregenous data type and follows insertion order.
        al1.add("Neha");
        al1.add(10);

        System.out.print("ArrayList1: ");
        System.out.println(al1);

        ArrayList al2=new ArrayList();
        //ArrayList does not follow the sorting order
        System.out.print("ArrayList2: ");
        al2.add(40);
        al2.add(30);
        System.out.println(al2);

        ArrayList al3=new ArrayList();
        //ArrayList can store duplicates
        System.out.print("ArrayList3: ");
        al3.add("Kyra");
        al3.add("Kyra");
        System.out.println(al3);

        ArrayList al4=new ArrayList();
        //ArrayList can store multiple null values
        System.out.print("ArrayList4: ");
        al4.add(null);
        al4.add(null);
        System.out.println(al4);
    }
}
