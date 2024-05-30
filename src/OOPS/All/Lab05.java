/*Perform Lab03 using getter, setter methods + parameterized constructor*/


package OOPS.All;

public class Lab05 {
    public static void main(String[] args) {
        FullTimeEmployee3 e2=new FullTimeEmployee3();
        e2.setEmpId("A123");
        e2.setEmpName("Neha Jagwani");
        e2.setMonthlySalary(10000.5);
        e2.setBonus(500);
        e2.displayInfo();

        FullTimeEmployee3 e3=new FullTimeEmployee3("A456", "Raghu Jagwani", 9333, 200);
        e3.displayInfo();
    }
}

class FullTimeEmployee3 extends Employee3
{
    //Attributes
    double bonus;

    //Default constructor
    FullTimeEmployee3()
    {
    }

    //Parameterized constructor
    FullTimeEmployee3(String empId, String empName, double monthlySalary, double bonus)
    {
        super(empId, empName, monthlySalary);
        this.bonus=bonus;
        /*this.setBonus(bonus);
        this.getBonus();*/
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


abstract class Employee3 {
    //Attributes
    private String empId;
    private String empName;
    private double monthlySalary;

    //Default constructor
    Employee3()
    {

    }

    Employee3(String empId, String empName, double monthlySalary)
    {
        this.empId=empId;
        /*this.setEmpId(empId);
        this.getEmpId();*/
        this.empName=empName;
        /*this.setEmpName(empName);
        this.getEmpName();*/
        this.monthlySalary=monthlySalary;
        /*this.setMonthlySalary(monthlySalary);
        this.getMonthlySalary();*/
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