package OOPS;

public class Student {
    String name;
    int age;

    public void printInfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student()
    {
        name="default constructor name";
        age=24;
    }

    Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
}
