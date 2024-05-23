package SingleLevel;

public class Main1 {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.houseChild();
        c1.houseFather();
    }
}
     class Child extends Father{
        //Attributes
        int childAge;

        //Methods
        void houseChild()
        {
            System.out.println("This is child's house.");
        }
        void printChildAge(int age)
        {
            System.out.println("Child's age is"+" "+this.childAge);
        }

        //Default Constructor
        Child()
        {
            System.out.println("I am Child's DC");
        }

        //Parameterized constructor
        Child(int age)
        {
            this.childAge=age;
        }
    }

     class Father{
        //Attributes
        int fatherMoney;

        //Methods
        void houseFather()
        {
            System.out.println("This is Father's house");
        }

        void printFatherMoney(int money)
        {
            System.out.println("Father has "+" "+this.fatherMoney);
        }

        //Default Constructor
        Father()
        {
            System.out.println("I am Father's DC");
        }

        //Parameterised constructor
        Father(int money)
        {
            this.fatherMoney=money;
        }
    }


