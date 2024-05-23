//Method 4: Initialize variable in the default constructor, also print using 'this' in the DC.

package Classes.DC;

public class Lab04_Class {
    public static void main(String[] args) {
        Child4 c4=new Child4();
    }
}

class Child4
{
    //Attributes
    int childAge;

    //Default Constructor
    Child4()
    {
        childAge=33;
        System.out.println(this.childAge);
    }
}