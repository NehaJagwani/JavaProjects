
package DataStructures.ArrayListScannerInput;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Lab02_DoubleInput {
    public static void main(String[] args) {
        ArrayList<Double> al2=new ArrayList();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements in double: ");

        //can do as below also
        /*while(sc.hasNextDouble())
        {
            double d1=sc.nextDouble();
            al2.add(d1);
        }*/

        while(sc.hasNextDouble())
        {
            al2.add(sc.nextDouble());
        }

        System.out.println("The elements are: ");
        Iterator<Double> itr=al2.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        sc.close();
    }
}
