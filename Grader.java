import java.util.Scanner;
/**
 * Grader
 */
public class Grader {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter grade from (A, B, C or F) : ");

        String str = scanner.next();
        char grade = str.charAt(0);

        switch (grade) {
               case 'A':
                     System.out.println("Grade A - marks >=80");
                     break;
 
               case 'B':
                     System.out.println("Grade B - marks >=60");
                     break;

               case 'C':
                     System.out.println("Grade C - marks >=40");
                     break;
                     
               case 'F':
                     System.out.println("Grade F - marks <40 FAIL");
                     break;
                     
               default : //optional
                     System.out.println("Invalid Grade");
                     break; //optional
        }
 }
}