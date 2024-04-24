//A: 90-100, B:80-89, C: 70-79, D: 60-69, F: 0-59

package Ex_23042024;
import java.util.Scanner;

public class Lab67_score_grade {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the score");
        int score=sc.nextInt();


        if(score>=90 && score<=100)
        {
            System.out.printf("The grade is A");
        } else if (score<=89 && score>=80) {
            System.out.printf("The grade is B");
        }
        else if (score<=79 && score>=70){
            System.out.println("The grade is C");
        } else if (score<=69 && score>=60) {
            System.out.println("The grade is D");
        }
        else
        {
            System.out.println("The grade is F");
        }
        sc.close();
    }
}
