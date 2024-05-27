//Interfaces can have default concrete methods and static concrete methods.
//Default concrete methods can be called using object's reference.
//Static concrete methods cna be called using interfacename.static method(). See below
//the instance variables in an interface can only be public static final. If you do not mention the
//access modifier, by default, it is considered as public.
//You can mention any of the combinations stated below
// int a=10 OR public int a=10 OR public static final int a =10 OR final int a=10 OR anything but
//should be public static final
//Interfaces cannot have traditional non abstract methods but can have default concrete methods
//and static concrete methods.

package OOPS.Interface;

public class Lab03_Interface {
    public static void main(String[] args) {
        Company c=new Company();
        c.work();
        c.eat();
        Employee.sleep();
        System.out.println(c.a);
    }
}

class Company implements Employee
{
    public void work()
    {
        System.out.println("I am an employee and I work in Infosys");
    }
}

interface Employee
{
    public abstract void work();
    public static final int a=10;
    default void eat()
    {
        System.out.println("I eat lunch in office");
    }
    static void sleep()
    {
        System.out.println("I do not sleep in office");
    }
}

