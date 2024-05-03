//Write a program using for loop that prints the sum of even and odd numbers.

package ForLoop;

public class For_Loop_Summation_Even_Odd {
    public static void main(String[] args) {
       int j=0;
       int k=0;
        for(int i=1;i<=10;i++)
        {
            if(i%2==0)
            {
                j=j+i;
            }
            else
            {
                k=k+i;
            }
        }
        System.out.printf("Sum of Even Numbers is %d.\n", k);
        System.out.printf("Sum of Odd Numbers is %d. ", j);
    }

}
 //odd numbers sum=25
//even number sum=30