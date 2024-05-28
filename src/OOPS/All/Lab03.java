/*Below example shows use of abstract methods, parameterized constructor, this, super keywords, taking
the input from the user.
*/

package OOPS.All;
import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Employee Id: ");
        String empId=sc.next();
        System.out.println();

        System.out.print("Enter Employee Name: ");
        String empName=sc.next();
        System.out.println();

        System.out.print("Enter Monthly salary: ");
        double monthlySalary=sc.nextDouble();
        System.out.println();

        System.out.print("Enter Bonus: ");
        double bonus=sc.nextDouble();
        System.out.println();

        FullTimeEmployee e1=new FullTimeEmployee(empId, empName, monthlySalary, bonus);
        e1.displayInfo();
    }
}


class FullTimeEmployee extends Employee
{
    //Attributes
    double bonus;

    //Default constructor
    FullTimeEmployee()
    {

    }

    //Parameterized constructor
    FullTimeEmployee(String empId, String empName, double monthlySalary, double bonus)
    {
        super(empId, empName, monthlySalary);
        this.bonus=bonus;
    }

    void displayInfo()
    {
        System.out.println("Employee details of a full time employee are as follows:");
        System.out.println("Employee Id: "+" "+super.empId);
        System.out.println("Name: "+" "+super.empName);
        System.out.println("Monthly Salary:"+" "+super.monthlySalary);
        System.out.println("Bonus: "+" "+this.bonus);
    }
}


abstract class Employee {
    //Attributes
    String empId;
    String empName;
    double monthlySalary;

    //Default constructor
    Employee() {

    }

    //Parameterized constructor
    Employee(String empId, String empName, double monthlySalary) {
        this.empId = empId;
        this.empName = empName;
        this.monthlySalary = monthlySalary;
    }

    //Abstract method
    abstract void displayInfo();
}