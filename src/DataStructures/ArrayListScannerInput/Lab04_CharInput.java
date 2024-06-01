package DataStructures.ArrayListScannerInput;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Lab04_CharInput {
    public static void main(String[] args) {

        ArrayList<Character> al4 = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character elements:, type exit to finish ");

        while(true)
        {
            String input=sc.next();
            if(input.equalsIgnoreCase("exit"))
            {
                break;
            }
            char ch=input.charAt(0);
            al4.add(ch);
        }

        Iterator itr=al4.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        sc.close();
    }
}
