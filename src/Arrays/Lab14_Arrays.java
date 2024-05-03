//In Arrays, == or .equals() : both checks for reference means address.

package Arrays;

public class Lab14_Arrays {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={1,2,3,4,5};
        System.out.println(arr1==arr2);
        System.out.println(arr1.equals(arr2));
    }
}
