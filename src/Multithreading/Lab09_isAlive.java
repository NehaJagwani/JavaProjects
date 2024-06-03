//isAlive will return a boolean value. True if the thread is alive else false if the thread is dead.


package Multithreading;
 public class Lab09_isAlive {
    public static void main(String[] args) {
        Test9 t8=new Test9();
        t8.start();
    }
}

class Test9 extends Thread{
     public void run()
     {
         System.out.println("Is thread alive"+":"+Thread.currentThread().isAlive());
     }
}