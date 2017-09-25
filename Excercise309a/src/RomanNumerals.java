import java.util.Scanner;
public class RomanNumerals
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Type in the integer from 1 to 10 ");
      int number = input.nextInt();
   //   if (number<1 && number>10)
  //       System.out.println("Invalid number. Try from 1 to 10 ");
      switch(number)
      {
         case 1 : System.out.println("I"); break;
         case 2 : System.out.println("II"); break;
         case 3 : System.out.println("III"); break;
         case 4 : System.out.println("IV"); break;
         case 5 : System.out.println("V"); break;
         case 6 : System.out.println("VI"); break;
         case 7 : System.out.println("VII"); break;
         case 8 : System.out.println("VIII"); break;
         case 9 : System.out.println("IX"); break;
         case 10 : System.out.println("X"); break;
         default : System.out.println("Invalid number. Try from 1 to 10"); 
      }
      input.close();
   }
}
