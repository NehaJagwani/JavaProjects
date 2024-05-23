//Method 3: Initialize instance variable in the DC, print it in a function using the same variable.

package Classes.DC;

public class Lab03_Class {
    public static void main(String[] args) {
        Child3 c3=new Child3();
        c3.displayChildAge();
    }
}

class Child3
{
    int childAge;
    Child3()
    {
        childAge=45;
    }
    void displayChildAge()
    {
        System.out.println(childAge);
    }
}
