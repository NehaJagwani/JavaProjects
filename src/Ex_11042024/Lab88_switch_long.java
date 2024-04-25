//Long data type is converted to Short and Integer

package Ex_11042024;

public class Lab88_switch_long {
    public static void main(String[] args) {

        //Case 1: LONG CONVERTED TO AN INTEGER. Can append l in the end while initializing a variable.
        long l = 982311l;  //while initializing, you can append l in the end.
        switch ((int) l) {
            case 982311:
                System.out.println("Long is converted to an integer.");
                break;
            default:
                System.out.println("Hi, I am not long");
        }

        /*Case 2: Can append l in the end while initializing a variable, but cannot append l in the end, will throw an error.
        long l1 = 982311l;
        switch ((int) l1) {
            case 982311l: //this is not allowed.
                System.out.println("hi, I am long");
                break;
            default:
                System.out.println("Hi, I am not long");
        }*/

        //Case 3: LONG CONVERTED TO SHORT.
        long l3 = 23456;
        switch ((short) l3)
        {
            case 23456: //this is not allowed.
                System.out.println("Long is converted to short");
                break;
            default:
                System.out.println("Long cannot be converted to short");
        }



    }
}
