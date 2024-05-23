//If the variable names are different in both the parent and child class, then
// using 'this' keyword, child class can access attributes and methods of parent class in a single inheritance.

package Classes.This;

public class Lab01_this {
    public static void main(String[] args) {
        Child1 c1=new Child1();
        c1.displayAge();
    }
}

class Child1 extends Father1
{
    int childAge;
    Child1()
    {
        childAge=3;
    }

    //Using this, child class is even able to access Father's class attributes and methods.
    void displayAge()
    {
        System.out.println(this.childAge);
        System.out.println(this.fatherAge);
    }
}

class Father1
{
    int fatherAge;
    Father1()
    {
        fatherAge=44;
    }
 }
