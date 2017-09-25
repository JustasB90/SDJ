/* Write nested loops to draw this pattern
   *******
   ******
   *****
   ****
   ***
   **
   *           Justas Brazdeikis 6/9/2017
*/

public class SimpleStars
{
   public static void main(String[] args)
   {
      int i = 7;
      int starNum = 7;
      for (i=7; i>=1; i--) //This cycle controls the current line
      {
         for (starNum=i; starNum>=1; starNum--)  //This cycle draws stars
         {
         System.out.print("*");  
         }
         System.out.println();
      }
      
   }
}
