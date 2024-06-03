//Case 6: Executing multiple tasks from multiple threads.

package Multithreading;

public class Lab06 {
    public static void main(String[] args) {
        Th1 thread1=new Th1();
        thread1.run();
        Th2 thread2=new Th2();
        thread2.run();
    }
}

class Th1 extends Thread{
    public void run()
    {
        System.out.println("First task");
    }

}

class Th2 extends Thread{
    public void run()
    {
        System.out.println("Second task");
    }
}
