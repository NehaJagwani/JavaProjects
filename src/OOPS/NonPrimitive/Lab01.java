//Arrays can store primitive and non-primitive data. Non-primitive data means objects.
//Arrays can store objects also.

package OOPS.NonPrimitive;

public class Lab01 {
    public static void main(String[] args) {
        Test t1=new Test();
        Test t2=new Test();
        Test t3=new Test();

        //this is how we define an array to store objects.
        Test[]t={t1,t2,t3};
        System.out.println(t1);
        System.out.println(t2);
    }
}

class Test
{

}
