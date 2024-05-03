//Final will not allow you to change the length of the array. You can still change the content.
package Arrays;

public class Lab12_Arrays_Final {
    public static void main(String[] args) {
        final int []arr1=new int[2];
        //arr1[]={10,20};
        arr1[0]=10;
        arr1[1]=20;
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);

        arr1[0]=78;
        arr1[1]=90;
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);

    }
}
