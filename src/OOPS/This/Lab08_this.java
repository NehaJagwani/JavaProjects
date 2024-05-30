//this can be used to current class instance.

package OOPS.This;

public class Lab08_this {
    public static void main(String[] args) {
        ThisDemo t=new ThisDemo();
        t.m1();
    }
}

class ThisDemo
{
    ThisDemo m1()
    {
        return this;
    }
}
