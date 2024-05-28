package OOPS.Exceptions;

public class Lab08_Exception {
    public static void main(String[] args) {

        Lab08_Exception t=new Lab08_Exception();
        t.divide();
    }

        void divide ()
        {
            int a = 100, b = 0, c = 0;
            try {
                c = a / b;
            } catch (Exception e) {
                System.out.println("Cannot divide by zero");
            }
        }
    }




