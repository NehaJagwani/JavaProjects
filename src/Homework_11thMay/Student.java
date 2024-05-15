package Homework_11thMay;

public class Student {
    //Attributes
    String name;
    int age;
    long phone_num;

    //Parameterized constructor
    Student(String name, int age, long phone_num)
    {
        this.name=name;
        this.age=age;
        this.phone_num=phone_num;
    }

    //Behaviour
    public void printStudentInfo()
    {
        System.out.println("My name is "+name+". I am " +age+" and my phone number is " +phone_num+".");
    }
}




