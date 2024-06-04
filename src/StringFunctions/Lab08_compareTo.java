//compareTo() will compare the strings lexicographically
//will return 0 if both the strings are equal


package StringFunctions;

public class Lab08_compareTo {
    public static void main(String[] args) {

        //will return 0
        System.out.println("Raghu".compareTo("Raghu"));

        //will subtract the ASCII valuesof 'N'(78) and 'n'(110) and will return -32.
        System.out.println("Neha".compareTo("neha"));

        //will subtract the ASCII values of 'k'(107) and 'K'(75) and will return 32.
        System.out.println("kyra".compareTo("Kyra"));

        //will compare the ASCII values of 'h'(104) and 'a'(97) and will return 7.
        System.out.println("NEh".compareTo("NEa"));
    }
}
