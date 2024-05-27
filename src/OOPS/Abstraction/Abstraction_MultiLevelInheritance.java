package OOPS.Abstraction;

public class Abstraction_MultiLevelInheritance
{
    public static void main(String[] args) {
        Brake1 b1=new Brake1();
        b1.drive();
        b1.brake();
    }
}
class Brake1 extends Car1
{
    void brake()
    {
        System.out.println("I am Car's brake");
    }
}
abstract class Car1 extends Vehicle1
{
    void drive()
    {
        System.out.println("I drive a Car");
    }
    abstract void brake();
}

abstract class Vehicle1
{
    abstract void drive();
}
