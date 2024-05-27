//Accessing Parent's class variables using 'super' keyword. (super.var name)

//If the variable names are same/different in both the parent and child class, then child object
// method can access parent's class instance variable using the 'super' keyword.
//Below is an example wherein the instance variable name is different in both the parent and child class.

package OOPS.Super;

public class Lab03_super {
    public static void main(String[] args) {
        Child3 c3=new Child3();
        c3.displayAge();
    }
}

class Child3 extends Father3
{
    int childAge;
    Child3()
    {
        childAge=3;
    }
    void displayAge()
    {
        System.out.println("Child's age is"+" "+this.childAge);
        System.out.println("Father's age is"+" "+super.fatherAge);
    }
}

class Father3
{
    int fatherAge;
    Father3()
    {
        fatherAge=40;
    }
}
