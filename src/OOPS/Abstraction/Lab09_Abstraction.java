package OOPS.Abstraction;

public class Lab09_Abstraction {
    public static void main(String[] args) {
        Horse3 h3=new Horse3();
        h3.walk();
        h3.eat();
    }
}

class Horse3 extends Animal3
{
    void eat()
    {
        System.out.println("I eat plants");
    }
}
abstract class Animal3
{
    void walk()
    {
        System.out.println("I have 4 legs to walk");
    }
}