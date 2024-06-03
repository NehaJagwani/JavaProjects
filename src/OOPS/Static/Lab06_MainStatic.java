/*Properties:
1. A static method belongs to the class, not to the object.
2. A static method/variable can directly be accessed by using class's name
3. A static method/variable can also be accessed by using an object reference.
4. A static method cannot access a non-static method/non-static variable.
5. A non-static method can access a static method/variable.
6. Static block is executed just once when the class is created.
7. A static method cannot refer to 'this' or 'super' keyword in any way.
*/

package OOPS.Static;

public class Lab06_MainStatic {
    public static void main(String[] args) {
        Person3 p3=new Person3();
        p3.displayAge();
        p3.displayInfo();


        //A static variable can be accessed directly by using class's name.
        System.out.println("Person's age is"+" "+Person3.age);

        //A static variable can also be accessed by using an object reference
        System.out.println("Person's age is"+" "+p3.age);

        Person3 p=new Person3();
        p.displayAge();
    }
}

class Person3
{
    static int age=10;
    String name="Neha";

    static
    {
        System.out.println("I will be executed only once when the class is created");
    }

    //A static variable can ofcourse be accessed by a static method.
    // However, a static method cannot call a non-static variable/non-static method.
    static void displayAge()
    {
        System.out.println("My age is"+" "+age);

        //A static method cannot access a non-static variable/method.Below are not allowed.
       // System.out.println("My name is"+" "+name);
       //System.out.println(displayInfo());
    }

    //A non-static method can access a static variable.
    void displayInfo()
    {
        System.out.println("My name is"+" "+name);

        //A static variable can be accessed from a non-static method as well.
        System.out.println("My age is"+" "+age);
    }
}