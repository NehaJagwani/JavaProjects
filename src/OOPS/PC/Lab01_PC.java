//Method1: You can print child's age in the PC using 'this' keyword.

package OOPS.PC;

public class Lab01_PC {
    public static void main(String[] args) {
        Child1 c1=new Child1();
        Child1 c2=new Child1(34);
    }
}

class Child1
{
    int childAge;

    //Default constructor
    Child1()
    {
        System.out.println("I am Child's DC.");
    }

    //Parameterized constructor
    Child1(int childAge)
    {
        this.childAge=childAge;
        System.out.println(this.childAge);
    }
}
