/* Use a loop to read 7 doubles from keyboard and store them into an array. Find the smallest element 
 * in the array and print this to the screen
 * Justas Brazdeikis 11/9/2017
 */
import java.util.Scanner;
public class SmallestDouble
{
   public static void main(String[] args)
   {
      Scanner input= new Scanner(System.in);
      int i;
      double smallest=Double.MAX_VALUE;
      double[] doubArray;
      doubArray = new double[7];
      
      for (i=0; i<doubArray.length; i++)
      {  
         System.out.println("Type in a double");
         doubArray[i]=input.nextDouble();
         if (doubArray[i]<smallest)
            smallest=doubArray[i];
      }
      input.close();
      System.out.println("The smallest double is "+ smallest);
   }
}
