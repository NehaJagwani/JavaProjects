//If we give an arrow after case, there is no need to write break statement.
package Ex_11042024;

public class Lab105_switch_arrow {
    public static void main(String[] args) {
        int itemcode=004;
        switch(004)
        {
            case 002, 004-> System.out.println("Yes, this itemcode is correct");
            case 003-> System.out.println("This is incorect");
            default-> System.out.println("I am default");
        }
    }
}
