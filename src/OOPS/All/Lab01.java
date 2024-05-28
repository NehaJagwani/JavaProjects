package OOPS.All;
import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {


        SavingsAccount sa2=new SavingsAccount(2);
        System.out.println("The current balance is"+" "+sa2.getBalance());

        Scanner sc=new Scanner(System.in);

        //Deposit Amount code
        System.out.println("Enter the amount that you would like to deposit: ");
        try {
            double depositAmount = sc.nextDouble();
            sa2.deposit(depositAmount);
        }
        catch(IllegalArgumentException e)
        {
            e.printStackTrace();
        }
        System.out.println("The balance amount after deposit is"+" "+sa2.getBalance());

        //Withdraw Amount code
        System.out.println("Enter the amount that you would like to withdraw: ");
        try {
            double withdrawAmount = sc.nextDouble();
            sa2.withdraw(withdrawAmount, sa2.interestRate);
        }
        catch(InsufficientFundsException e)
        {
            e.printStackTrace();
        }
        System.out.println("The balance amount after withdrawal is"+" "+sa2.getBalance());
    }
}

class InvalidDepositAmountException extends RuntimeException
{
    InvalidDepositAmountException()
    {
        super("You have entered an invalid deposit amount. Please try again");
    }
}

class InsufficientFundsException extends RuntimeException
{
    InsufficientFundsException()
    {
        super("Sorry, you do not have enough funds to withdraw.");
    }
}

class SavingsAccount extends BankAccount
{
    //Attributes
    double interestRate;
    double withdrawAmount;

    //Default constructor
    SavingsAccount()
    {
        super();
        interestRate=2;
        withdrawAmount=0;
    }

    //Parameterized constructor
    SavingsAccount(double interestRate)
    {
        super(123,100);
        this.interestRate=interestRate;
    }

    //Methods
    void withdraw(double withdrawAmount, double interestRate)
    {
        super.withdraw(withdrawAmount);
        balance=balance-interestRate;
    }
}

class BankAccount
{
    //Attributes
    int accountNumber;
    double balance;

    //Default Constructor
    BankAccount()
    {
        accountNumber=0;
        balance=0.0;
    }

    //Parameterized constructor
    BankAccount(int accountNumber, double balance)
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    //Methods
    void deposit(double depositAmount)
    {
        if(depositAmount<=0) {
            throw new InvalidDepositAmountException();
        }
        balance=balance+depositAmount;
    }

    void withdraw(double withdrawAmount)
    {
        if(withdrawAmount>balance)
        {
            throw new InsufficientFundsException();
        }
        balance=balance-withdrawAmount;
      //  System.out.println("The balance amount afer withdrawal is"+" "+balance);
    }

    double getBalance()
    {
        return balance;
    }
}
