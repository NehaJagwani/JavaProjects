package Classes;

public class StudentMain {
    public static void main(String[] args) {

        //Here, system will call default constructor automatically.
        Student student1=new Student();
        student1.name="Neha";
        student1.age=39;
        student1.printInfo();

        //Default constructor
        Student student2=new Student();
        student2.printInfo();

        //Parameterized constructor
        Student student3=new Student("Raghu", 40);
        student3.printInfo();
    }
}
