//Print sum of all numbers from 1 to 10 using a for loop.

package ForLoop;

public class Summation_ForLoop {
    public static void main(String[] args) {
        int num=0;
        for(int i=1;i<=10;i++)
        {
            num=num+i;
        }
        System.out.println("The sum of all numbers from 1 to 10 is: " +num);
    }
}
