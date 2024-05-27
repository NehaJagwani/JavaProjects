//If a class is abstract, then all methods inside it should be abstract.

package OOPS.Abstraction;

public class Abstraction_MultiLevelInheritance3 {
    public static void main(String[] args) {
        Bike4 b4=new Bike4();
        b4.drive();
        b4.park();
    }
}


class Bike4
{
    void drive()
    {
        System.out.println("I am GF Vehicle4");
    }
    void park()
    {
        System.out.println("I am Bike4s method");
    }
}

abstract class Car4 //Father class
{
    abstract void park();
}

abstract class Vehicle4 //GF class
 {
    abstract void drive();
 }