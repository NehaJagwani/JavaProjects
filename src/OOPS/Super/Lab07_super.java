//Accessing parent's class default constructor using the super keyword.
//The parent's class DC can be accessed from inside the child class by saying super()
//Even if you do not use the super(), the moment the child's object is created the parent's DC is
//called automatically.

package OOPS.Super;

public class Lab07_super {
    public static void main(String[] args) {
    Child7 c7=new Child7();
    }
}

class Child7 extends Father7{
    Child7()
    {
        super();
        System.out.println("Child's DC.");
    }
}

class Father7
{
    Father7()
    {
        System.out.println("Father's DC.");
    }
}