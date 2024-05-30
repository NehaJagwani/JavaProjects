//this keyword is used to invoke current class method.

package OOPS.This;

public class Lab03_this {
    public static void main(String[] args) {
        T2 t2=new T2();
        t2.display();
    }
}

class T2
{
    void show()
    {
        System.out.println("Hello");
    }
    void display()
    {
        this.show();
    }
}