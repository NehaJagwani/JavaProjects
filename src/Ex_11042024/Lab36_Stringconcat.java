package Ex_11042024;

public class Lab36_Stringconcat {
    public static void main(String[] args) {
        String s1="Neha";
        String s2=" Jagwani";
        String s3=s1.concat(s2);
        System.out.printf("My name is %s\t& my husband's name is", s3);

        String s4=" Raghu";
        String s5=" Jagwani.";
        System.out.printf(s4.concat(s5));
    }
}
