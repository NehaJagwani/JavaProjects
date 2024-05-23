//Accessing Parent's class variables using 'super' keyword. (super.var name)

// If the variable names are same/different in both the parent and child class, then child object
// method can access parent's class instance variable using the 'super' keyword.
//Below is an example wherein the instance variable name is "age" in both the parent and child

package Classes.Super;

public class Lab02_super {
    public static void main(String[] args) {
        Child2 c2=new Child2();
        c2.printAge();
    }
}


class Child2 extends Father2
{
    int age;
    Child2()
    {
        age=10;
    }

    void printAge()
    {
        System.out.println("Child's age is"+" "+this.age);
        System.out.println("Father's age is"+" "+super.age);
    }
}

class Father2
{
    int age;
    Father2()
    {
        age=40;
    }
}
