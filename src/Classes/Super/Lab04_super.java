//Accessing parent's methods using the super keyword.[super.methodname()]
//Even if the method name between the child and parent class is same or different, using the super
//keyword, the child can access parent's class method.

package Classes.Super;

public class Lab04_super {
    public static void main(String[] args) {
        Child4 c4=new Child4();
        c4.displayHouse();
    }
}

class Child4 extends Father4
{
    void house()
    {
        System.out.println("This is child's house");
    }
    void displayHouse()
    {
        this.house();
        super.house();
    }
}

class Father4
{
    void house()
    {
        System.out.println("This is Father's house");
    }
}