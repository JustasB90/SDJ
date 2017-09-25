import java.util.Scanner;
public class TimeCalculator
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Type in the number of seconds ");
      int seconds = input.nextInt();
      if (seconds>=60 && seconds<3600)
         {
         int minutes = seconds / 60;
         System.out.println("The number of minutes is " + minutes);
         }
      if (seconds>=3600 && seconds<86400)
         {
         int hours = seconds / 3600;
         System.out.println("The number of hours is " + hours);
         }
      if (seconds >= 86400)
      {
         int days = seconds / 86400;
         System.out.println("The number of days is " + days);
      }
      input.close();
   }
}
