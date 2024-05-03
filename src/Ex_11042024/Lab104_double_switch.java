//gets error that selector type long, float are not allowed.
package Ex_11042024;

public class Lab104_double_switch {
    public static void main(String[] args) {
            double d1=10;
            switch((byte)d1)
            {
                case 10:
                System.out.println("Double can be converted to byte");
                break;
                default:
                    System.out.println("Double cannot be converted to byte");
            }

        double d2=10;
        switch((int)d2)
        {
            case 10:
                System.out.println("Double can be converted to an integer");
                break;
            default:
                System.out.println("Double cannot be converted to an integer");
        }

        double d3=10;
        switch((short)d3)
        {
            case 10:
                System.out.println("Double can be converted to short");
                break;
            default:
                System.out.println("Double cannot be converted to short");
        }

     /*   double d4=10;
        switch((float)d4)
        {
            case 10:
                System.out.println("Double can be converted to float");
                break;
            default:
                System.out.println("Double cannot be converted to float");
        }

        double d5=10;
        switch((long)d4)
        {
            case 10:
                System.out.println("Double can be converted to long");
                break;
            default:
                System.out.println("Double cannot be converted to long");
        }*/
    }
}
