/*
Thread priorities:
1. JVM allocates priority to a thread.The threads are executed based on the priority.
2. Multiple threads may get same priority as well, in this case, JVM will decide which thread to execute first.
3. Priority is an integer number that is provided to every thread.
4. Whichever thread we wants to execute first, we give them high priority.
5.Priorities are represented in the form of integer values which ranges from 1 to 10.
6. 1: MIN_PRIORITY, 5: NORM_PRIORITY, 10: MAX_PRIORITY
7. 0, <1, >10 cannot be set as priorities.
8. Java not provided any constants for other priorities such as 2,3,4,6,7,8,9.
8. Methods: a). public final void setPriority(int value)
            b). public final int getPriority()
9. By default, the priority of main thread is 5.
10. Priorities are always inherited from its parent thread.
ex: if we create a new thread from main thread, the new thread's priority will be 5 since main thread's
priority by default is always 5.
11. You can also change priority of the main thread.
12. If I try to set priority to any value not between 1-10, it will throw runtime exception i.e. IllegalArgument
Exception.
13. Windows does not support priority, so low priority may be executed first and high priority may be executed next.

*/

package Multithreading;

public class Lab11_ThreadPriorities {
    public static void main(String[] args) {
        //Can also change the priority of the main thread by using below.
        //Thread.currentThread().setPriority(10);


        //By default, the priority of main thread is 5 and it will be passed to it's child as well.
        System.out.println("By default, the priority of main thread is"+" "+Thread.currentThread().getPriority());
        Test11 t11=new Test11();
        t11.start();

        Test11 tt=new Test11();
        //Set priority before the start method
        tt.setPriority(6);
        tt.start();

        Test11 tt1=new Test11();
        tt1.setPriority(Thread.MIN_PRIORITY);
        tt1.start();

    }
}

class Test11 extends Thread
{
    public void run()
    {
        //for thread=0, the priority will be 5 since thread-0 is created from the main thread.
        System.out.println("I am"+" "+Thread.currentThread().getName()+" and my priority is"+" "+Thread.currentThread().getPriority());
    }
}