//Below program will print ArrayIndexOutOfBoundsException since the index specifies a character.

package Arrays;

public class Lab07_ArrayException {
    public static void main(String[] args) {
        int arr1[]={10,20};
        System.out.println(arr1['n']);
    }
}
