package DataStructures.Stack;

import java.util.Stack;

public class Lab01_Stack {
    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.add(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        System.out.println(s1);
        s1.pop();
        System.out.println(s1);
        s1.peek();
    }
}
