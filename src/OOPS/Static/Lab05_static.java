package OOPS.Static;

public class Lab05_static {
    public static void main(String[] args) {
        Counter c1=new Counter();
        c1.displayCount();

    }
}

class Counter
{
    static int count;

    Counter()
    {

    }
    static
    {
        count=3;
    }

    void increment()
    {
        count=count+1;
    }

    void displayCount()
    {
        increment();
        System.out.println(count);
    }
}

/*class Mathutils
{
    int num1=0, num2=0, num3=0;
    static int add()
    {
        num3=num1+num2;
        return num3;
    }
}*/