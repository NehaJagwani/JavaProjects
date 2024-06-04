//.equals will check the value

package StringFunctions;

public class Lab23_StringEquals {
    public static void main(String[] args) {
        String str1="Neha"; //1 object created in SCP
        String str2="Neha"; //0 objects created in SCP as the string literal "Neha" already exists
        System.out.println(str1.equals(str2)); //will return true

        String str3=new String("Kyra"); //2 objects are created, 1 in the heap area, 1 in SCP
        String str4=new String("Kyra"); //1 object is created in heap area
        System.out.println(str3.equals(str4));//will return true

        String str5=new String("Raghu");//2 objects are created, 1 in the heap area and 1 in SCP
        String str6="Raghu";//0 objects are created
        System.out.println(str5.equals(str6));//will return true

        String str7="Sahil"; //1 object is created in SCP
        String str8=new String("Sahil");//1 object is created in heap area
        System.out.println(str7.equals(str8));//will return true

        String str9="Sahil";
        System.out.println(str7.equals(str9));//will return true
    }
}
