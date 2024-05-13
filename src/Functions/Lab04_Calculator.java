package Functions;

public class Lab04_Calculator {
    public static void main(String[] args) {
        int sum=sum(10,2);
        int mul=mul(10,2);
        int sub=sub(10,2);
        int div=div(10,2);
        System.out.println(sum);
        System.out.println(mul);
        System.out.println(sub);
        System.out.println(div);
    }

    static int sum(int i, int i1) {
         return i+i1;
    }

    static int mul(int i, int i1) {
        int mul=i+i1;
        return mul;
    }

    static int sub(int i, int i1){
        int sub=i+i1;
        return sub;
    }

    static int div(int i, int i1) {
        int div=i+i1;
        return div;
    }
}
