package MultiLevelInheritance;

public class Child extends Father{

    //Attributes
    int childAge;

    //Methods
    void childHouse()
    {
        System.out.println("I am a Child and I own a 1 BHK house");
    }
    void printChildAge(int age)
    {
        System.out.println("Child's age is"+" "+this.childAge);
    }

    //Default Constructor
    Child()
    {
        System.out.println("I am Child's DC");
    }

    //Parameterised Constructor
    Child(int age)
    {
        this.childAge=age;
    }
}
