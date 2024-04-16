package Ex_11042024;
//The rules are same as int, short, etc. i.e. float variable cannot start with an integer. The output will always contain decimal.
// The first character must be lowercase/upercase alphabets, underscore, dollar sign. After the first character, the subsequent characters
//can be lowercase/uppercase alphabets, underscore, dollar, numbers.
//The subsequent chars cannot be special characters except $ and _.
//Below commented are not allowed.
//float can contain decimal / can contain integers also. See rows 16 & 22.
//If the value does not contain decimal, it is upto the user's choice to add the character 'f' in the value. See row 16 & 19 below.
//If the value contains decimal, the character 'f' needs to be appended in the end. See row 22.

public class Lab009_float {
    public static void main(String[] args) {
        //float 1A=123;
        //float A%=234;
        //float A1=123.3 - will not work. The correcrt way is float A1=123.3f.
        float A1=123;
        System.out.println(A1);

        float A2=123f;
        System.out.println(A2);

        float A3=123.3f;
        System.out.println(A3);
                        }
}
