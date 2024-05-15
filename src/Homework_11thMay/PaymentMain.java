package Homework_11thMay;

public class PaymentMain {
    public static void main(String[] args) {

        //Create 1st object
        Payment p1 = new Payment("Online", "Debit Card", "Paid");
        p1.printPaymentInfo();

        //Create 2nd object
        Payment p2 = new Payment("Online", "Credit Card", "UnPaid");
        p2.printPaymentInfo();
    }
}
