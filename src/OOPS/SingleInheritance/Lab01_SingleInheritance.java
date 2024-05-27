package OOPS.SingleInheritance;

public class Lab01_SingleInheritance {
    public static void main(String[] args) {

        Child1 c1=new Child1();
        c1.childName="Neha";
        c1.displayChildName();
        c1.fatherName="Raghu";
        c1.displayFatherName();
    }
}

class Father1
{
    //Attributes
    String fatherName;

    //Default Constructor
    Father1()
    {
        System.out.println("I am Father's DC.");
    }

    //Parameterized constructor
    Father1(String fatherName)
    {
        this.fatherName=fatherName;
    }

    //Methods
    void displayFatherName()
    {
        System.out.println("Father's name is"+" "+this.fatherName);
    }
}

class Child1 extends Father1
{
    //Attributes
    String childName;

    //Default constructor
    Child1()
    {
        System.out.println("I am Child's DC.");
    }

    //Paramterized constructor
    Child1(String childName)
    {
        this.childName=childName;
    }

    //Methods
    void displayChildName()
    {
        System.out.println("Child's name is"+" "+this.childName);
    }
}
