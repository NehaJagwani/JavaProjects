package Homework23rdApril;

public class Prime_Numbers {
    public static void main(String[] args) {
        int div=0;
        boolean prime=true;
        System.out.println("List of Prime Numbers from 1 to 100 are: \n");
        for(int n=1;n<=100;n++) {
            prime=false;
            div=2;
            while (div < n) {
                if (n%div == 0) {
                    prime = false;
                    break;
                } else {
                    div++;
                }
            }
            if(div==n)
            {
                prime=true;
            }
            if(prime==true)
            {
                System.out.printf("%d ",n);
            }
        }
    }
}
