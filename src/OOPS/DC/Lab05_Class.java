//Method 5: Initialize variable in the default constructor, print the instance variable in the DC
// without using 'this'.

package OOPS.DC;

public class Lab05_Class {
    public static void main(String[] args) {
        Child5 c5=new Child5();
    }
}

class Child5
{
    //Attributes
    int childAge;

    //Default constructor
    Child5()
    {
        childAge=34;
        System.out.println(childAge);
    }
}
