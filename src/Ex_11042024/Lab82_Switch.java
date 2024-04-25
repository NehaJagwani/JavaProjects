//Multiple case numbers are allowed.
//If you give 2 break's in a single case, you get an error saying "unreachable statement".


package Ex_11042024;


public class Lab82_Switch {
    public static void main(String[] args) {
    int num=002;
    switch(num)
    {
        case 001,002,003:
            System.out.println("I won");
            break;
            //break;
        case 004, 000:
            System.out.println("You won");
            break;
        default:
            System.out.println("We both won");
    }


    }
}
