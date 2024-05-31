package DataStructures.ArrayListScannerInput;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Lab03_FloatInput {
    public static void main(String[] args) {
        ArrayList al3=new ArrayList();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Float values: ");
        while(sc.hasNextFloat())
        {
            float f1=sc.nextFloat();
            al3.add(f1);
        }

        System.out.println("The Float elements are: ");
        Iterator itr=al3.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
         sc.close();
    }
}
