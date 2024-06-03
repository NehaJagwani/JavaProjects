/*
1. There are 2 sleep methods
2. a). public static native void sleep(long milliseconds) throws InterruptedException (native means the implementation
is done in some other language other than Java).
   b). public static void sleep(long milliseconds, int nanoseconds) throws InterruptedException
3. Both are static methods means both the methods can be called directly using the Thread class i.e Thread.sleep()
4. If I call sleep(), means the current thread's execution will be paused for the specified time.
5. sleep() throws InterruptedException, so with sleep(), you have to handle it using either throw
or try catch.
*/

package Multithreading;

public class Lab13_sleep {
    public static void main(String[] args) throws InterruptedException {

        for (int i=1;i<=5;i++)
        {
            Thread.sleep(1000);
            System.out.println(i);
        }
       }
}



