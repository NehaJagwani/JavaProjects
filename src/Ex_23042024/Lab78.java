package Ex_23042024;

public class Lab78 {
    public static void main(String[] args) {
        int n1=1;
        int n2=0;
        int n3=0;
        int n4=0;
        while(n1<=16)
        {
            n2=(6*n1);
            n3=n2-1;
            if(n3/5==1)
            {
                System.out.printf("%d is a Prime Number\n", n3);
            }
            else if ((n3%5==0) || (n3%7==0))
            {
                 System.out.println();
            }
            else
            {
                System.out.printf("%d is a Prime Number\n", n3);
            }

            n2=(6*n1);
            n4=n2+1;
            if(n4/7==1) {
                System.out.printf("%d is a Prime Number\n", n4);
            }

            else if ((n4%5==0) || (n4%7==0))
            {
                System.out.println();
            }
            else
            {
                System.out.printf("%d is a Prime Number\n", n4);
            }
            n1++;
        }
    }
}
