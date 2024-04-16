package Ex_11042024;
//Identifiers: Identifiers can also be names given to variable.
//ex: int age, so age is an identifier.
//Identifiers can be alphabets, numbers from 0 to 9 , $ and _
//Identifiers cannot start with numbers.
//Below are some exercises to show different usgaes of an identifier.
//Commented one's are not allowed.
//Am using jdk21, hence, single underscore(_) is not allowed as an identifie. See row 18 below.

public class Lab001_int {
    public static void main(String[] args) {
        int age = 8;
        int age1=85;
        int $age=67;
        int _age=89;
        int $=90;
        //int _=12;
        int __ = 78;
        int _$=12;
        int $age12_=56;
        int Age=54;
        int _neha=75;
        // int 1neha=45;
        //int #1=87;
        System.out.println(age);
        System.out.println(age1);
        System.out.println($age);
        System.out.println(_age);
        System.out.println($);
        // System.out.println(_);
        System.out.println(__);
        System.out.println(_$);
        System.out.println($age12_);
        System.out.println(Age);
        System.out.println(_neha);
    }
}
