//Method 1: Declare the instance variable inside the child class.
//Set the variable value in the main class and print it in the main class using an object reference.

package Classes.DC;

public class Lab01_Class {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.childAge=32;
        System.out.println("Child's age is"+" "+c1.childAge);
    }
}

    class Child1
    {
        //Attributes
        int childAge;
    }

