package Classes.Abstraction;

public class Abstraction_SingleLevelInheritance {
    public static void main(String[] args) {
        Car2 c2=new Car2();
        c2.drive();
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
     abstract void drive();
}
