//Method 2: Initialize child's age in the default constructor. Then, print child's age by calling a
//method displayChildAge() and print using the 'this' keyword.


package Classes.DC;

public class Lab02_Class {
    public static void main(String[] args) {
        Child2 c2=new Child2();
        c2.displaychildAge();
    }
}

class Child2
{
    //Attributes
    int childAge;

    //Default Constructor
    Child2()
    {
        childAge = 38;
    }

    //Methods
    void displaychildAge()
    {
        System.out.println(this.childAge);
    }
}
