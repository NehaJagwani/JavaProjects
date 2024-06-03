//creating a thread from a runnable interface.

package Multithreading;

public class Lab02_Runnable {
    public static void main(String[] args) {
        Test t2=new Test();
        Thread th=new Thread(t2);
        th.start();
    }
}

class Test implements Runnable{
    public void run()
    {
        System.out.println("Creating a thread from Runnable interface.");
    }
}
