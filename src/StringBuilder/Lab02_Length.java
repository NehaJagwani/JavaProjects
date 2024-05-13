package StringBuilder;
import java.util.Scanner;

public class Lab02_Length {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        StringBuilder s1=new StringBuilder(sc.nextLine());
        System.out.println("The length of"+" "+s1+" "+"is "+s1.length());
    }
}
