package OOPS.Exceptions;

public class Lab06_Exception {
    public static void main(String[] args) {
        int a=100, b=0, c=0;
        String name=null;
        try
        {
            c=a/b;
            int l=name.length();
        }
        catch(ArithmeticException e)
        {
            System.out.println("You cannot divide by 0");
          //  System.out.println("Cannot find length of null");
        }
       catch(NullPointerException e1)
        {
            System.out.println("Cannot find length of null");
        }
    }
}
