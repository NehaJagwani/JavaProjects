//To check if both the arrays are equal/not, use Arrays.equals(). Pass the array names in Arrays.equals(arr1, arr2).

package Arrays_1D;

import java.util.Arrays;

public class Lab34_Array_Equal {
    public static void main(String[] args) {

        int arr1[] = {10, 20, 30};
        int arr2[] = {40, 50, 60};

        if(Arrays.equals(arr1,arr2))
        {
            System.out.println("The two arrays are equal");
        }
        else
        {
            System.out.println("The two arrays are not equal");
        }
    }
}
