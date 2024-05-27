//If the parent class wants to access his own method, it can be done by creating a parent class object
// and using the 'this' keyword.
//If a child object is created and it calls the parent's method, the 'this' inside parent will call the
//child class.

package OOPS.Super;

public class Lab05_super {
    public static void main(String[] args) {

        //this will still display the child class
        Child5 c5=new Child5();
        c5.displayHouse1();

        //this will call the Parent class method
        Father5 f5=new Father5();
        f5.displayHouse1();
    }
}

class Child5 extends Father5
{
    void house()
    {
        System.out.println("This is Child's house");
    }
}

class Father5
{
    void house()
    {
        System.out.println("This is Father's house");
    }
    void displayHouse1()
    {
        this.house();
    }
}