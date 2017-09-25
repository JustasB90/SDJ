/* Write a program that 
 * a) Reads 10 integers from the keyboard and stores them into array called x
 * b) Prints out all 10 elements in one line
 * c) Makes another loop to find the smallest element
 * d) Prints out the index of the smallest element and its value
 * Justas Brazdeikis 12/9/2017
 */
import java.util.Scanner;
public class IndexOfSmallest
{
   public static void main(String[] args)
   {
      Scanner input= new Scanner(System.in);
      int[] x = new int[10];
      int i;
      //a) read inputs and store them into an array
      for (i=0; i<x.length; i++)
      {
         System.out.println("Type an integer");
         x[i]=input.nextInt();
      }
      //b 
      for (i=0; i<x.length; i++)
         System.out.print(x[i] + " ");
      //c
      int smallest=Integer.MAX_VALUE;
      int j=0;  //for index
      for (i=0; i<x.length; i++)
      {
         if (x[i]<smallest)
         {
            smallest=x[i];
            j=i;
         }
            
      }
      System.out.println();
      System.out.println("The smallest value is " + smallest + " and it's index is " + j);
     input.close(); 
   }
}
