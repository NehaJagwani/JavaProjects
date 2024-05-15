package Homework_11thMay;

public class StudentMain {
    public static void main(String[] args) {

        //Create 1st object
        Student s1 = new Student("Neha", 39, 413731465);
        s1.printStudentInfo();

        //Create 2nd object
        Student s2=new Student("Raghu", 40, 421925986);
        s2.printStudentInfo();

        //Create 1st object.
        Course c1=new Course("Java", 10000);
        c1.printCourseInfo();

        //Create 2nd object.
        Course c2=new Course("JIRA", 12000);
        c2.printCourseInfo();

        //Create 1st object
        Payment p1 = new Payment("Online", "Debit Card", "Paid");
        p1.printPaymentInfo();

        //Create 2nd object
        Payment p2 = new Payment("Online", "Credit Card", "UnPaid");
        p2.printPaymentInfo();
        }

}
