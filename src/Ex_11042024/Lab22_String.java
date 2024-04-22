//in line 8, s1 will still be printed as lowercase neha because s1 first needs to be assigned to s2. See line 9.

package Ex_11042024;

public class Lab22_String {
    public static void main(String[] args) {
        String s1="neha";
        s1.toUpperCase();
        String s2=s1.toUpperCase();
        System.out.println(s2);
    }
}
