package Arrays_2D;

public class Lab01 {
    public static void main(String[] args) {
          int arr1 [][]={ {1,2},
                      {3,4},
                      {5,6},
                      {7,8}
        };
        System.out.println("The length of the Array is: "+arr1.length);
        System.out.println("The address of the Array is: "+arr1);

        System.out.println("The Array Elements are: ");
        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j < arr1[i].length ; j++) {
                System.out.print(arr1[i][j]);
                System.out.print('\t');
            }
            System.out.println();
        }
    }
}
