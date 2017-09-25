//Write a while loop that lets the user enter a number. The number should be multiplied by 10 and the result stored 
//in the variable product. The loop should iterate as long as product contains a value less than 100. Justas Brazdeikis 6/9/2017
import java.util.Scanner;
public class MultiplyInput
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int product = 0;
      while (product<100)
      {
         System.out.println("Enter a number");
         int number = input.nextInt();
         product = number*number;
         System.out.println("The product is " + product);
      }
     input.close(); 
   }
}
