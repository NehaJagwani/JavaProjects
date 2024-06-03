/*
1. yield() stops the current thread execution and give chance to other threads for execution.
2. when yield() is called, the control goes to the thread scheduler, it depends on the thread scheduler
if he wants to stop the current thread execution/not.
3. Method: a). public static native void yield();
3. Since it is a static method, it can be accessed directly by using the Thread class.
*/

package Multithreading;

public class Lab18_yield {
    public static void main(String[] args) {
        Test18 t18=new Test18();
        t18.start();
        //if you want main to stop and thread to be executed first, use yield() here, but, still,
        //it depends on the thread scheduler.
        Thread.yield();
        for(int i=1;i<=5;i++)
        {
            System.out.println("Main thread"+" "+i);
        }
    }
}

class Test18 extends Thread{
    public void run()
    {
        //if you want main to executed first, use yield() here, but, still, it depends on the thread scheduler.
        Thread.yield();
        for (int i=1;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}