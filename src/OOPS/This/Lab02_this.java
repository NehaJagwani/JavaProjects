//this keyword is used to invoke instance variable.

package OOPS.This;

public class Lab02_this {
    public static void main(String[] args) {
        T1 t1=new T1();
        t1.setI(10);
        t1.show();
    }
}

class T1
{
    int i;
    void setI(int i)
    {
        this.i=i;
    }
    void show()
    {
        System.out.println(i);
    }
}