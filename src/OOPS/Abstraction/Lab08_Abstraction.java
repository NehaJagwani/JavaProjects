//Even an abstract can be declared without any data in it. See below, same like interface.

package OOPS.Abstraction;

public class Lab08_Abstraction {
    public static void main(String[] args) {
        Horse2 h1=new Horse2();
        h1.walk();
    }
}

class Horse2 extends Animal2
{
    void walk()
    {
        System.out.println("I walk on 4 legs");
    }
}

abstract class Animal2
{

}