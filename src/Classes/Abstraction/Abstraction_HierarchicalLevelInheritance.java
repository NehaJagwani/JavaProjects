//Below is an example of hierarchical inheritance.
// Parent class can be made abstract. Abstract class means it will have an incomplete method.
//Objects cannot be created of an abstract class. In the below example, objects cannot be created of
//the Vehicle class. The abstract methods of the base class needs to be completed in the child class.
//Objects can only be created in the child class.

package Classes.Abstraction;

public class Abstraction_HierarchicalLevelInheritance{
    public static void main(String[] args) {
        Car c1=new Car();
        c1.park();
        c1.drive();

        Bike b1=new Bike();
        b1.drive();
    }
}

class Car extends Vehicle
{
    int carSpeed=100;
    void drive()
    {
        System.out.println("I am a Car");
    }
}

class Bike extends Vehicle
{
    void drive()
    {
        System.out.println("I am a Bike");
    }
}

abstract class Vehicle
{
    void park()
    {
        System.out.println("The vehicle is parked");
    }
    abstract void drive();
}