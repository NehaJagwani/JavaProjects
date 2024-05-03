package Ex_11042024;

public class Lab92_Switch_String {
    public static void main(String[] args) {
        String s1="Neha";
        String s2=new String("raghu");
        switch(s1)
        {
            case "Neha":
                System.out.println("My name is Neha");
                break;
            case "raghu":
                System.out.println("My name is Raghu");
                break;
            default:
                System.out.println("My name is not Neha");
        }
    }
}
