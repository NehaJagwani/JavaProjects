//Please note that an abstract class can have a constructor but the constructor cannot be marked
//as abstract.

package OOPS.Abstraction;

public class Abstraction_Constructor {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.bark();
    }
}

class Dog extends Animal{

    void bark()
    {
        System.out.println("I bark");
    }

}

abstract class Animal
{
    int eyes;
    Animal()
    {
        eyes=2;
        System.out.println("I am Animal's DC. ");
    }
    Animal(int eyes)
    {
        this.eyes=eyes;
        System.out.println(this.eyes);
    }
     abstract void bark();
}
