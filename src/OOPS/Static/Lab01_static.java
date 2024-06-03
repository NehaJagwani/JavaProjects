//Declaring the instance variable and a block as static.
//Making use of default constructor

package OOPS.Static;

public class Lab01_static {
    public static void main(String[] args) {
        ATB a1=new ATB();
        ATB a2=new ATB();
        System.out.println(ATB.courseName);
        System.out.println(a1.courseName);
        System.out.println(a2.courseName);
    }
}

class ATB
{
    static String courseName="Java";

    static
    {
        System.out.println("I will be executed only once when the class is created");
    }
    {
        System.out.println("I am IIB");
    }


    ATB()
    {
        System.out.println("I am DC");
    }
}