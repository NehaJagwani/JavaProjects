package Ex_23042024;

public class Lab78_Primenumbers_6nmethod {
    public static void main(String[] args) {
        int n1=1;
        int n2=0;
        int n3=0;
        int n4=0;
        System.out.println("Prime Numbers from 1 to 100 are: ");
        while(n1<=16)
        {
            n2=(6*n1);
            n3=n2-1;
            if(n3/5==1)
            {
                System.out.printf("%d\t", n3);
            }
            else if ((n3%5==0) || (n3%7==0))
            {
                System.out.println();
            }
            else
            {
                System.out.printf("%d\t", n3);
            }

            n2=(6*n1);
            n4=n2+1;
            if(n4/7==1) {
                System.out.printf("%d\t", n4);
            }

            else if ((n4%5==0) || (n4%7==0))
            {
                System.out.println();
            }
            else
            {
                System.out.printf("%d\t", n4);
            }
            n1++;
        }
    }
}
