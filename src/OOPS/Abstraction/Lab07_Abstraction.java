//In this example, you are creating a reference of a parent abstract class but the object created
// is that of the child class. You can never create an object of an abstract class.

package OOPS.Abstraction;

public class Lab07_Abstraction {
    public static void main(String[] args) {
      /*  PrintMyBook p1 = new PrintMyBook();
        p1.getDetails("The Magic", "Rhonda Byrne", 150);*/

        Book myBook=new PrintMyBook();
        myBook.getDetails("The Magic", "Rhonda Byrne", 150);

    }
}

class PrintMyBook extends Book{
    void getDetails(String name, String author, int price)
    {
        System.out.println(name+" "+author+" "+price);
    }

}
abstract class Book
{
    abstract void getDetails(String name, String author, int price);
}