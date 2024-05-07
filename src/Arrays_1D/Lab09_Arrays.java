//Alternate way of defining an array.Also, the output for below will be 0 since no values are assigned to
//an array.

package Arrays_1D;

public class Lab09_Arrays {
    public static void main(String[] args) {
        int arr1[]=new int[5];
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);

        arr1[0]=67;
        arr1[1]=76;

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);

    }
}
