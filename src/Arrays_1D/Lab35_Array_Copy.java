package Arrays_1D;

import java.util.Arrays;

public class Lab35_Array_Copy {
    public static void main(String[] args) {
        int arr1[]={1,2,3};
        int arr2[]= Arrays.copyOf(arr1, arr1.length);
        for (int i = 0; i <arr2.length ; i++) {
            System.out.println(arr2[i]);
        }
    }
}
