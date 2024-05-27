//Below example shows how to access parameterized constructor of the parent class using the
//super keyword. [super(value)]
// The PC of the parent class can be accesssed from the PC of the child class using the
//super(params). super(params) has to be the first statement inside the child's PC.

package OOPS.Super;

public class Lab06_super {
    public static void main(String[] args) {
        Child6 c6=new Child6(56);
   }
}

class Child6 extends Father6
{
    Child6(int age)
    {
        super(90);
        System.out.println("Child's age is"+" "+age);
    }
}

class Father6
{
    Father6(int age)
    {
        System.out.println("Father's age is"+" "+age);
    }
}