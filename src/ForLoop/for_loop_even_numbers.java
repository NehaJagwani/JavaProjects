package ForLoop;

public class for_loop_even_numbers {
    public static void main(String[] args) {
        System.out.println("Even numbers are: ");
        for(int i=1;i<=10;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }

        System.out.println("Odd numbers are: ");
        for (int i = 1; i <=10 ; i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }
    }
}
