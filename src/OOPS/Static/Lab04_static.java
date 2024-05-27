//In case of static below will work even though the object is set to null.

package OOPS.Static;

public class Lab04_static {
    public static void main(String[] args) {
        Person2 p2=null;
        p2.m1();

    }
}

class Person2
{
    static void m1()
    {
        System.out.println("I am m1");
    }
}