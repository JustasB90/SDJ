//Use a loop to read 10 integers from keyboard and store them into an array. Use another loop to print out the elements
// in a reverse order. Justas Brazdeikis 11/9/2017
import java.util.Scanner;
public class ReversePrint
{
   public static void main(String[] args)
   {
      int i;
      int[] numArray;
      numArray = new int[10];
      Scanner input = new Scanner(System.in);
      for ( i=0; i<10; i++)
      {
         System.out.println("Type an integer");
         numArray[i]=input.nextInt();
      }
      
      for (i=9; i>=0; i--)
         System.out.println(numArray[i]);
      input.close();
   }
}
