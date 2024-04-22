package Ex_11042024; //important example

public class Lab26_String {
    public static void main(String[] args) {
        String s1="orange";  //stored in SCP
        String s2="orange";  //stored in SCP
        String s3=new String("orange");//stored in heap area

        System.out.println(s1==s2);  //== checks for reference, ans is true
        System.out.println(s1.equals(s2)); // == check the values, ans is true

        System.out.println(s1==s3);  //== checks for reference, ans is false
        System.out.println(s1.equals(s3)); //checks for value, ans is true

        System.out.println(s2==s3);  //== checks for reference, ans is false
        System.out.println(s2.equals(s3));// checks for value, ans is true
    }
}
