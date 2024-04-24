//Find prime numbers between 1 to 100

package Homework23rdApril;

public class Lab79_PrimeNumbers {
    public static void main(String[] args) {
        int num = 1;
        boolean prime=true;
        System.out.print("Prime Numbers from 1 to 100 are:");
        while (num <= 100)
        {
            prime=true;
            for (int i = 2; i < num; i++)
            {
                if (num % i == 0)
                {
                    prime = false;
                    break;
                }
            }
            if(num==1)
            {
                prime=false;
                System.out.println();
            }

            if (prime == true)
            {
                System.out.printf("%d\t", num);
            }
            num++;
        }
    }
}

