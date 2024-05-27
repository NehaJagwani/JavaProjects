//Declaring the method as static.
// Changing the value of a static variable
//Also, making use of parameterized constructors

package OOPS.Static;

public class Lab02_static {
    public static void main(String[] args) {
        Person p1=new Person("Neha");
        System.out.println(p1.name);
        p1.m2();
        Person.m1();
        p1.m1();
        System.out.println(Person.coursename);
        Person.coursename="ATB1";
        System.out.println(Person.coursename);


    }
}

class Person
{
    {
        System.out.println("IIB");
    }


    static String coursename="ATB";

    String name;
    static void m1()
    {
        System.out.println("I am a static method");
    }
    void m2()
    {
        System.out.println("I am a non static method");
    }
    Person(String name)
    {
        this.name=name;
    }
}