package Homework_11thMay;

public class Course {

    //Attributes
    String course_name;
    int course_fees;

    //Parameterized constructor
    Course(String course_name, int course_fees)
    {
        this.course_name=course_name;
        this.course_fees=course_fees;
    }

    //Methods
    public void printCourseInfo()
    {
        System.out.println("The course name is "+course_name+" and the fees is "+course_fees+".");
    }

}
