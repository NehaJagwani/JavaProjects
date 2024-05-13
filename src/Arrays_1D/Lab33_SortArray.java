//An array can be sorted using Arrays.sort(). Pass the array name in round brackets.

package Arrays_1D;

import java.util.Arrays;

public class Lab33_SortArray {
    public static void main(String[] args) {

        int arr1[]={90,56,78,12};
        Arrays.sort(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
