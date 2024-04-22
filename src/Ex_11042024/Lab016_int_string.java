package Ex_11042024;
//Commented one's are not allowed.
//As per the analysis, seems, only the (s1+i2-i1) is not allowed.

public class Lab016_int_string {
    public static void main(String[] args) {
        int i1=10;
        int i2=45;
        String s1="Neha";

        //addition
        System.out.println(s1+i1+i2);
        System.out.println(i1+i2+s1);

        //subtraction
        System.out.println(i2-i1+s1);
        // System.out.println(s1+i2-i1);

        //multiplication
        System.out.println(i1*i2+s1);
        System.out.println(s1+i1*i2);

        //division
        System.out.println(i2/i1+s1);
        System.out.println(s1+i2/i1);

          }
}
