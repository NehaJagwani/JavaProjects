//Below program will print ArrayIndexOutOfBoundsException since the 3rd value i.e. arr1[3] is not present.

package Arrays_1D;

public class Lab05_ArrayException {
    public static void main(String[] args) {
        int arr1[]={10,20,30};
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);

    }
}
