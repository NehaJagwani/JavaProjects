//Create a thread using the Thread class

package Multithreading;

public class Lab01_Thread {
    public static void main(String[] args) {
      Test1 t1=new Test1();
      t1.start();
   }
}

class Test1 extends Thread{
    public void run()
    {
        System.out.println(" Creating a thread from Thread class");
    }

}