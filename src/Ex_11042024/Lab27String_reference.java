package Ex_11042024;

public class Lab27String_reference {
    public static void main(String[] args) {

        String s1="neha";
        String s2=new String("neha");

        System.out.println(s1==s2);  //this checks reference.
        System.out.println(s1.equals(s2));  //this checks values/contents.

    }
}
