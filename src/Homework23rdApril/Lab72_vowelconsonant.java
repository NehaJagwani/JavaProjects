//Assignment to check whether the character is a vowel or a consonant.
package Homework23rdApril;
import java.util.Scanner;

public class Lab72_vowelconsonant {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Input a character: ");
        char ch=sc.next().charAt(0);

        if
        ( (ch=='A') || (ch=='E') || (ch=='I') || (ch=='O') || (ch=='U')||
                    (ch=='a') || (ch=='e') || (ch=='i') || (ch=='o') || (ch=='u'))
        {
            System.out.println("Hurray, it's a Vowel");
        }
        else
        {
            System.out.println("Uff, it's a consonant");
        }
        sc.close();
    }

    public static class PrimeNumbers_While {
        public static void main(String[] args) {
            int div = 0;
            boolean prime;
            System.out.println("Prime Numbers from 1 to 100 are: \n");
            for (int n = 1; n <= 100; n++) {
                prime=false;
                div = 2;
                while (div < n) {
                    if (n % div == 0) {
                        prime=false;
                        break;
                    } else {
                        div++;
                    }
                }
                if (div == n) {
                    prime=true;
                }
                if(prime==true)
                {
                    System.out.printf("%d ",n);
                }
            }
        }
    }
}
