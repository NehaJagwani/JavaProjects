//Even though an interface is just declared and is completely blank, it's fine. See below
package OOPS.Interface;

public class Lab02 {
    public static void main(String[] args) {
        Horse h1=new Horse();
        h1.walk();

    }
}

class Horse implements Animal
{
    void walk()
    {
        System.out.println("I have 4 legs");
    }
}

interface Animal
{

}


