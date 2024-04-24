package Ex_23042024;

public class Lab77_Primenumbers {
    public static void main(String[] args) {
        int i1 = 4;
        int i2 = 0;
        while (i1 <= 100) {
            i2 = i1 * i1;
            i2 = i2 - 1;
            if (i2 % 24 == 0) {
                if(i1%5==0)
                {
                    System.out.printf("%d is NOT a Prime Number\n", i1);
                }
                else
                {
                    System.out.printf("%d is a Prime Number\n", i1);
                }

            } else {
                System.out.printf("%d is NOT a Prime Number\n", i1);
            }
            i1++;
        }
    }
}

