//A non-static variable cannot be accessed from a static method.
//A static variable can be accessed from a non-static method.

package OOPS.Static;

public class Lab03_static {
    public static void main(String[] args) {
        Person1 p1=new Person1();
        p1.display();
    }
}

class Person1
{

    //Non static variable cannot be accesssed from a static method
    /*String name="Neha";
   static void m1()
    {
        System.out.println("My name is"+" "+name);
    }*/

    //A static variable can be accessed from a non-static method, can also use 'this.name' below
    static String name="Neha";
    void display()
    {
        System.out.println("My name is"+" "+name);
    }
    Person1()
    {
        System.out.println("I am a DC");
    }
}
