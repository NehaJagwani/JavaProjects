package Interface;

import javax.swing.plaf.metal.MetalIconFactory;

public class Lab01 {
    public static void main(String[] args) {
        I1 c = new C1();
        c.show();
    }
}



interface I1
{
    abstract void show();
}

class C1 implements I1
{
    public void show()
    {
        System.out.println("Neha");
    }
}
