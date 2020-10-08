import java.util.Scanner;  
public class Nest
{
   public static void main(String[] args)
   {
      int year;    
      Scanner console = new Scanner(System.in);

      System.out.print("Enter a year : ");
      year = console.nextInt();


      if (year % 4 == 0)
      {
         if (year % 100 == 0)
         {
            if (year % 400 == 0)
            {
               System.out.println("A leap year");
            }
            else
            {
               System.out.println("Not a leap year");
            }
         }
         else
         {
            System.out.println("A leap year");
         }
      }
      else
      {
         System.out.println("Not a leap year");
      }
   }
}