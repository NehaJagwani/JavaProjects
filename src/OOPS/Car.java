package OOPS;

public class Car {
    String color;
    String name;
    Car()
    {
        color="blue";
        name="Toyota";
    }
    public void drive()
    {
        System.out.println(this.color);
        System.out.println(this.name);
    }
}
