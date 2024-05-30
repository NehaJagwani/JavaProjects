//this keyword can be used to pass as an argument to the method

package OOPS.This;

public class Lab06_this {
    public static void main(String[] args) {
        T6 t6=new T6();
        t6.m2();
    }
}

class T6
{
    void m1(T6 t6)
    {
        System.out.println("I am in M1 method");
    }

    void m2()
    {
        m1(this);
    }
}

