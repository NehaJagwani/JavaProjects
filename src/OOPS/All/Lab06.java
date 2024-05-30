/*Use of getter and setter methods by taking the input from the user*/

package OOPS.All;
import java.util.Scanner;

public class Lab06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Employee Id: ");
        String empId=sc.next();
        System.out.println();

        System.out.print("Enter Employee Name: ");
        String empName=sc.next();
        System.out.println();

        System.out.print("Enter Monthly Salary: ");
        int monthlySalary = sc.nextInt();
        System.out.println();

        System.out.print("Enter Bonus: ");
        double bonus=sc.nextDouble();
        System.out.println();

        FullTimeEmployee4 e2=new FullTimeEmployee4();
        e2.setEmpId(empId);
        e2.setEmpName(empName);
        e2.setMonthlySalary(monthlySalary);
        e2.setBonus(bonus);
        e2.displayInfo();
    }
}

class FullTimeEmployee4 extends Employee4
{
    //Attributes
    double bonus;

    //Default constructor
    FullTimeEmployee4()
    {
    }

    //Getter Setter methods
    public void setBonus(double bonus)
    {
        this.bonus=bonus;
    }
    public double getBonus()
    {
        return bonus;
    }

    void displayInfo()
    {
        System.out.println("Employee details of a full time employee are as follows:");
        System.out.println("Employee Id: "+" "+super.getEmpId());
        System.out.println("Name: "+" "+super.getEmpName());
        System.out.println("Monthly Salary:"+" "+super.getMonthlySalary());
        System.out.println("Bonus: "+" "+this.getBonus());
    }
}


abstract class Employee4 {
    //Attributes
    private String empId;
    private String empName;
    private int monthlySalary;

    //Default constructor
    Employee4()
    {

    }

    //Getter Setter methods
    public void setEmpId(String empId)
    {
        this.empId=empId;
    }
    public String getEmpId()
    {
        return empId;
    }

    public void setEmpName(String empName)
    {
        this.empName=empName;
    }
    public String getEmpName()
    {
        return empName;
    }

    public void setMonthlySalary(int monthlySalary)
    {
        this.monthlySalary=monthlySalary;
    }

    public double getMonthlySalary()
    {
        return monthlySalary;
    }

    //Abstract method
    abstract void displayInfo();
}
