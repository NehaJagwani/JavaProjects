//gets error that long, float, double are not allowed.

package Ex_11042024;

public class Lab101_short_switch {
    public static void main(String[] args) {
        short s1=10;
        switch((byte)s1)
        {
            case 10:
                System.out.println("Short can be converted to byte");
                break;
            default:
                System.out.println("Short cannot be converted to byte");
        }

        short s2=10;
        switch((int)s1)
        {
            case 10:
                System.out.println("Short can be converted to an integer");
                break;
            default:
                System.out.println("Short cannot be converted to an integer");
        }
/*
    //gets error that selector type long is not allowed.
        short s3=10;
        switch((long)s3)
        {
            case 10:
                System.out.println("Short can be converted to long");
                break;
            default:
                System.out.println("Short cannot be converted to long");
        }

        //gets error that selector type float is not allowed.
        short s4=10;
        switch((float)s4)
        {
            case 10:
                System.out.println("Short can be converted to float");
                break;
            default:
                System.out.println("Short cannot be converted to float");
        }


        //gets error that selector type double is not allowed.
        short s5=10;
        switch((double)s5)
        {
            case 10:
                System.out.println("Short can be converted to double");
                break;
            default:
                System.out.println("Short cannot be converted to double");
        }

*/
    }
}
