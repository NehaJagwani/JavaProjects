/*Perform Lab03 using getter, setter methods*/


package OOPS.All;

public class Lab04 {
    public static void main(String[] args) {
        FullTimeEmployee2 e2=new FullTimeEmployee2();
        e2.setEmpId("A123");
        e2.setEmpName("Neha Jagwani");
        e2.setMonthlySalary(10000.5);
        e2.setBonus(500);
        e2.displayInfo();

        FullTimeEmployee2 e3=new FullTimeEmployee2("A456", "Raghu Jagwani", 9333, 5000);
        e3.displayInfo();
    }
}

class FullTimeEmployee2 extends Employee2
{
    //Attributes
    double bonus;

    //Default constructor
    FullTimeEmployee2()
    {
    }

    //Parameterized constructor
    FullTimeEmployee2(String empId, String empName, double monthlySalary, double bonus)
    {
        super(empId, empName, monthlySalary);
        this.bonus=bonus;
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


abstract class Employee2 {
    //Attributes
    private String empId;
    private String empName;
    private double monthlySalary;

    //Default constructor
    Employee2()
    {

    }

    Employee2(String empId, String empName, double monthlySalary)
    {
        this.empId=empId;
        this.empName=empName;
        this.monthlySalary=monthlySalary;
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

    public void setMonthlySalary(double monthlySalary)
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