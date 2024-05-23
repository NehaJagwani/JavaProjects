//Method 2: You can print child's set in the PC using a display method.

package Classes.PC;

public class Lab02_PC {
    public static void main(String[] args) {
        Child2 c1 = new Child2();
        Child2 c2 = new Child2(67);
        c2.displayChildAge();
    }
}

class Child2
{
    int childAge;

    //Default constructor
    Child2()
    {
        System.out.println("I am child's DC.");
    }

    //Parameterized constructor
    Child2(int childAge)
    {
        this.childAge=childAge;
    }

    //Methods
    void displayChildAge()
    {
        System.out.println(this.childAge);
    }
}
