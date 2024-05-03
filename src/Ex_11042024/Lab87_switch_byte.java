//getting error that selector type long, float, double is not allowed.
package Ex_11042024;

public class Lab87_switch_byte {
    public static void main(String[] args) {

        byte b1 = 123;
        switch ((int)b1) {
            case 123:
                System.out.println("Byte is converted to an integer");
                break;
            default:
                System.out.println("Byte is not converted to an integer");
        }

        byte b2=123;
        switch((short)b2)
        {
            case 123:
                System.out.println("Byte is converted to short");
                break;
            default:
                System.out.println("Byte is not converted to short");
        }

       /*// Gets error that selector type float is not allowed.
        byte b3=12;
        switch((float)b1)
        {
            case 123:
                System.out.println("Byte is able to convert to float");
                break;
            default:
                System.out.println("Byte cannot be converted to float");
        }

        /*Gets error that selector type long is not allowed.
        byte b4=123;
        switch((long)b4)
        {
            case 123:
                System.out.println("Byte is converted to long");
                break;
            default:
                System.out.println("Byte cannot be converted to long");
        }*/

        /*Gets error that selector type long is not allowed.
        byte b5=12;
        switch((double)b5)
        {
            case 12:
                System.out.println("Byte is converted to double");
                break;
            default:
                System.out.println("Byte cannot be converted to double");
        }*/
    }
}
