//getting error that selector type long, float, double is not allowed.

package Ex_11042024;

public class Lab100_switch_int {
    public static void main(String[] args) {
        int i1=10;
        switch((byte)i1)
        {
            case 10:
                System.out.println("Integer can be converted to byte");
                break;
            default:
                System.out.println("Integer cannot be converted to byte");
        }

        int i2=10;
        switch((short)i2)
        {
            case 10:
            System.out.println("Integer can be converted to short");
            break;
            default:
                System.out.println("Integer cannot be converted to short");
        }
/*
        //gets error that selector type float is not allowed
        int i3=10;
        switch((float)10)
        {
            case 10:
                System.out.println("Integer is converted to float");
                break;
            default:
                System.out.println("Integer cannot be converted to float");
        }

        //gets error that selector type long is not allowed
        int i4=10;
        switch((long)i4)
        {
            case 10:
            System.out.println("Integer can be converted to long");
            break;
            default:
                System.out.println("Integer cannot be converted to float");
        }

        //gets error that selector type double is not allowed
        int i5=10;
        switch((double)i5)
        {
            case 10:
                System.out.println("Integer is converted to double");
                break;
            default:
                System.out.println("Integer cannot be converted to double");
        }
*/
    }
}
