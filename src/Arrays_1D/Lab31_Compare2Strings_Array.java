package Arrays_1D;

public class Lab31_Compare2Strings_Array {
    public static void main(String[] args) {
        String str1[]={"Java"};
        String str2[]={"Java"};

        System.out.println(str1==str2);

        for (int i = 0; i < str1.length; i++) {
            System.out.println(str1[i].equals(str2[i]));
        }
    }
}
