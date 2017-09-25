import java.util.Scanner;
public class DateTyper
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Type in the day");
      int day = input.nextInt();
      
      System.out.println("Type in the month");
      int month = input.nextInt();
      System.out.println("Type in the year");
      int year = input.nextInt();
      
      switch (month)
      {
         case 1:
            if (day<=31)
               System.out.println(day + "/" + month + "/" + year);
            else 
               System.out.println("Invalid day");
            break;
         case 2:
            if (day<=28)
               System.out.println(day + "/" + month + "/" + year);
            else 
               System.out.println("Invalid day");
            break;
         case 3:
            if (day<=31)
               System.out.println(day + "/" + month + "/" + year);
            else 
               System.out.println("Invalid day");
            break;
         case 4:
            if (day<=30)
               System.out.println(day + "/" + month + "/" + year);
            else 
               System.out.println("Invalid day");
            break;
         case 5:
            if (day<=31)
               System.out.println(day + "/" + month + "/" + year);
            else 
               System.out.println("Invalid day");
            break;
         case 6:
            if (day<=30)
               System.out.println(day + "/" + month + "/" + year);
            else 
               System.out.println("Invalid day");
            break;
         case 7:
            if (day<=31)
               System.out.println(day + "/" + month + "/" + year);
            else 
               System.out.println("Invalid day");
            break;
         case 8:
            if (day<=31)
               System.out.println(day + "/" + month + "/" + year);
            else 
               System.out.println("Invalid day");
            break;
         case 9:
            if (day<=30)
               System.out.println(day + "/" + month + "/" + year);
            else 
               System.out.println("Invalid day");
            break;
         case 10:
            if (day<=31)
               System.out.println(day + "/" + month + "/" + year);
            else 
               System.out.println("Invalid day");
            break;
         case 11:
            if (day<=30)
               System.out.println(day + "/" + month + "/" + year);
            else 
               System.out.println("Invalid day");
            break;
         case 12:
            if (day<=31)
               System.out.println(day + "/" + month + "/" + year);
            else 
               System.out.println("Invalid day");
            break;
         default :
            System.out.println("Invalid month");
             
      }
   input.close();   
   }
}
