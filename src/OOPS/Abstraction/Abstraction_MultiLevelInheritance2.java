package OOPS.Abstraction;

public class Abstraction_MultiLevelInheritance2 {
    public static void main(String[] args) {
        Brake3 b3=new Brake3();
        b3.travel();
        b3.drive();
        b3.park();
    }
}

class Brake3 //
{
    void travel()
    {
        System.out.println("I am GGF TRansport3");
    }
    void drive()
    {
        System.out.println("I am GF Vehicle3");
    }
    void park()
    {
        System.out.println("I am Father Car3");
    }
}

abstract class Car3 //Father
{
    abstract void park();
}

abstract class Vehicle3 //GF
{
    abstract void drive();
}

abstract class Transport3 //GGF
{
    abstract void travel();
}