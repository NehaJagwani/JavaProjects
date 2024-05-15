package Homework_11thMay;

public class Payment {

    //Attributes
    String paymentMode;   //cash or online
    String paymentType;   //Debit or Credit
    String paymentStatus; //Paid or Unpaid

    //Parameterizede constructor
    Payment(String paymentMode, String paymentType, String paymentStatus)
    {
        this.paymentMode=paymentMode;
        this.paymentType=paymentType;
        this.paymentStatus=paymentStatus;
    }

    //Behaviour
    public void printPaymentInfo()
    {
        System.out.println("The payment mode is "+paymentMode+" and the payment type is "
                +paymentType+" and the status is "+paymentStatus+".");
    }

}
