//this keyword is used to invoke current class constructor

package OOPS.This;

public class Lab05_this {
    public static void main(String[] args) {
        T4 t4=new T4();

    }
}

class T4
{
    T4()
    {
        this(10);
        System.out.println("I am default constructor");
    }
    T4(int i)
    {
        System.out.println("Parameterized constructor");
    }
}
