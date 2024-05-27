//Unchecked exception i.e. RunTime exception: ArithmeticException

package OOPS.Exceptions;

public class Lab03_Exception {
    public static void main(String[] args) {
       int a=10, b=0, c=0;
        try {
            c = a / b;
        }
    catch(ArithmeticException e) {
        System.out.println(e.getMessage());
    }

      /*  int a=100, b=0, c=0;
        c=a/b;
        System.out.println(c);*/
    }
}
