//Write a Java program to handle an ArrayIndexOutOfBoundsException when accessing an array element beyond
// its bounds.package OOPS.Exceptions;

public class Lab12_ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int arr1[] = new int[3];

        try {
            System.out.println(arr1[7]);

        } catch (ArrayIndexOutOfBoundsException e) {
             e.printStackTrace();
        }
    }
}


