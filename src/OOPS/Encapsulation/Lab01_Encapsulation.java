package OOPS.Encapsulation;

public class Lab01_Encapsulation {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setEmpId(100);
        System.out.println("The employee id is"+" "+e1.getEmpId());
    }
}

class Employee
{
    private int empId;
    public void setEmpId(int empId1)
    {
        empId=empId1;
    }
    public int getEmpId()
    {
        return empId;
    }
}