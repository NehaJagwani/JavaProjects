//Final method cannot be overridden. If you mention the method as final in a parent class,
//it cannot be overridden in the child class.

/* OOPS.Final;

public class Lab02_finalmethod {
    public static void main(String[] args) {
        B b=new B();
        b.show();
    }
}

class B extends A{
     void show()
    {
        System.out.println("I am final of child class");
    }
}

class A
{
     final void show()
    {
        System.out.println("I am final of Parent class");
    }
}*/