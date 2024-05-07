//Taking user input in a String array using Scanner class.

package Arrays_Diff_DataTypes_Scanner;
import java.util.Scanner;

public class Lab04_Array_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many friends do you have?");
        int num = sc.nextInt();

        sc.nextLine();

        String names[] = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Enter the name of the friend" + " " + (i + 1));
            names[i] = sc.nextLine();
        }

        System.out.println("The names of my friends are: ");
        for (int i = 0; i < num; i++) {
            System.out.println("My friend's" + " " + (i+1) +" " + "name is: ");
            System.out.println(names[i]);
        }
        sc.close();
    }
}

//Alternate method
       /* String str[]={"I am Neha.", "I am Raghu"};
        System.out.println(str[0]);
        System.out.println(str[1]);*/

       /* String str[]={"Neha", "Peehu", "Raghu"};
        System.out.println(str[0]);
        System.out.println(str[1]);

        String str1[]=new String[3];
        str1[0]="Neha";
        str1[1]="Peehu";
        System.out.println(str1[0]);
        System.out.println(str1[1]);*/


