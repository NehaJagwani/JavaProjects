//The parent class can be made abstract. It should have an abstract method that will be completed by
//the child class.
// An abstract class can also have a non-abstract method. A child object reference
//can call a non-abstract method also. (see gearbox below).
//Also, an abstract class may / may not have an abstract method. It is fine for an abstract class to
//not have an abstract method.


package OOPS.Abstraction;

public class Abstraction_SingleLevelInheritance {
    public static void main(String[] args) {
        Car2 c2=new Car2();
        c2.drive();
        c2.gearbox();
        c2.tyres=2;
        System.out.println(c2.tyres);
    }
}

class Car2 extends Vehicle2
{
    void drive()
    {
        System.out.println("I drive the car");
    }
}

abstract class Vehicle2
{
    int tyres;
     abstract void drive();
     void gearbox()
     {
         System.out.println("I am a gearbox");
     }
}
