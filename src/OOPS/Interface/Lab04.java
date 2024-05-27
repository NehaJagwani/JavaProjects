package OOPS.Interface;

public class Lab04 {
    public static void main(String[] args) {
        C1 c=new C1();
        c.eat();
        c.walk();

    }
}


class C1 implements I1
{
    public void walk()
    {
        System.out.println("I walk");
    }
    public void eat()
    {
        System.out.println("I eat");
    }
}

interface I1
{
    void walk();
}

