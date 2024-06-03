//Case 1: Executing a single task from a single thread.

package Multithreading;

public class Lab03 {
    public static void main(String[] args) {
        Test3 t3=new Test3();
        t3.start();
    }
}

class Test3 extends Thread{
    public void run()
    {
        System.out.println("Executing a single task from a single thread.");
    }
}
