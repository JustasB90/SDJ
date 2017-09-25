/* Read some integers from keyboard and store them into an array.
 * Find the second largest value in the array and print this to the screen.
 * Justas Brazdeikis 9/11/2017 
 */
import java.util.Scanner;
import java.util.Arrays;
public class SecondLargest
{
   public static void main(String[] args)
   {
      Scanner input=new Scanner(System.in);
      int [] array= new int[10];
      int i;
      
      int second=0;
      for (i=0; i<array.length; i++)
      {
         System.out.println("Type an integer");
         array[i]= input.nextInt();
                     
      }
      
      Arrays.sort(array);
      i=array.length-2;
      second=array[i];
      
      System.out.println("The second largest number is " + second);
      input.close();
   }
}
