package MultiLevelInheritance;

public class Father extends GrandFather{

    //Attributes
    String FatherName;

    //Methods
    void fatherHouse()
    {
        System.out.println("I am a Father and I own a 2 BHK house");
    }
    void printFatherName(String FatherName)
    {
        System.out.println("My Father's name is"+" "+this.FatherName);
    }

    //Default Constructor
    Father()
    {
        System.out.println("I am Father's DC.");
    }

    //Parameterised Constructor
    Father(String FatherName)
    {
        this.FatherName=FatherName;
    }
}

