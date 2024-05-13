package Arrays_1D;

import java.util.Arrays;

public class Lab36_StringArray_Copy {
    public static void main(String[] args) {
        String str1="Neha";
        char arr1[] = str1.toCharArray();
        char arr2[] = Arrays.copyOf(arr1, arr1.length);
        for (int i = 0; i <arr2.length ; i++) {
            System.out.println(arr2[i]);
        }
    }
}
