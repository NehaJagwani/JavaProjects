//throws is used to handle checked exceptions.
//throws is used with the method name.

package OOPS.Exceptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Lab09_throws {
    public static void main(String[] args) {
        ReadandWrite rw=new ReadandWrite();
        try {
            rw.readFile();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        System.out.println("hello");
        try {
            rw.saveFile();
        }
        catch (FileNotFoundException e1)
        {
            e1.printStackTrace();
        }
    }
}

class ReadandWrite
{
    void readFile() throws FileNotFoundException
    {
        FileInputStream fis=new FileInputStream("c:/abc.txt");

    }

    void saveFile() throws FileNotFoundException
    {
        String text="this is demo";
        FileOutputStream fos=new FileOutputStream("c:/abc.txt");
    }
}


