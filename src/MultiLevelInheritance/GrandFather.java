package MultiLevelInheritance;

public class GrandFather {

    //Attributes
    String GrandFatherName;

    //Methods
    void grandFatherHouse()
    {
        System.out.println("I am a Grand Father and I own a 3 BHK house");
    }
    void printGrandFatherName()
    {
        System.out.println("Grand Father's Name is"+" "+this.GrandFatherName);
    }

    //Default Constructor
    GrandFather()
    {
        System.out.println("I am Grand Father's DC");
    }

    //Parameterized Constructor
    GrandFather(String name)
    {
        this.GrandFatherName=name;
    }
}
