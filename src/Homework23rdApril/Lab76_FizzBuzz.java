package Homework23rdApril;

public class Lab76_FizzBuzz {
    public static void main(String[] args) {
        int i1=1;
        while (i1<=100)
        {
            if ((i1%3==0) && (i1%5==0)) //15, 30, 45
            {
                System.out.printf("%d: The number is both a multiple of 3 and 5: Hurray, It's a FIZZBUZZ. \n", i1);
            }
            else if ((i1%3==0) && (i1%5!=0)) /*3,6,9,12,18,21,24,27*/
            {
                System.out.printf("%d: The number is a multiple of 3: Wow, It's a FIZZ. \n", i1);
            }
            else if ((i1%5==0) && (i1%3!=0)) //5,10,20,25,35,40,50
            {
                System.out.printf("%d: The number is a multiple of 5: Omg, it's a BUZZ. \n", i1);
            }
            else
            {
                System.out.printf("%d: The number is neither FIZZ nor BUZZ. \n", i1);
            }
            i1++;
        }
    }
}
