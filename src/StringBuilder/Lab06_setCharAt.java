//setCharAt() is kind of a replace function.

package StringBuilder;

public class Lab06_setCharAt {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Tony");
        sb.setCharAt(0,'P');
        System.out.println(sb);

    }
}
