//This program demonstrates the while loop. Justas Brazdeikis 6/9/2017
public class WhileLoop
{
   public static void main(String[] args)
   {
      int number = 1;
      while (number <= 5)
      {
         System.out.println("Hello");
         number++;
      }
      System.out.println("That's all");
   }
}
 // 4.04b What is the purpose of the expression 'number <=5' in line 11? What would happen if you change it to 'number < 5 ' ?
 // Answer: It runs the cycle while number is no greater than 5. 
 //Changing it to < would mean 'less than 5' and print Hello one time less.

   