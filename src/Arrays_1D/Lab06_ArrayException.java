//Below program will print ArrayIndexOutOfBoundsException since the index is negative in the last statement.
package Arrays_1D;

public class Lab06_ArrayException {
    public static void main(String[] args) {
        int arr1[]={10,20};
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[-1]);
    }

}
