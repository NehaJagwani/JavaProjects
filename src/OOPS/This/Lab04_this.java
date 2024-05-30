//this keyword is used to invoke current class constructor

package OOPS.This;

public class Lab04_this {
    public static void main(String[] args) {
        T3 t3=new T3(10);

    }
}

class T3
{
    T3()
    {
        System.out.println("I am default constructor");
    }
    T3(int i)
    {
        this();
        System.out.println("Parameterized constructor");
    }
}