/*
 * Modify the previous excercise such that instead of declaring an integer variable start, you
 * create a loop of the form
 *          for(int start=0; start<x.length-1; start++)
 *          {
 *             //insert code for swapping the smallest element with the element on index start
 *          }
 *          
    Justas Brazdeikis 12/9/2017
*/    
import java.util.Scanner;
public class SelectionSort
{
   public static void main(String[] args)
   {
      Scanner input= new Scanner(System.in);
      int[] x = new int[10];
      int i,start;
      // a) read inputs and store them into an array
      for (i=0; i<x.length; i++)
      {
         System.out.println("Type an integer");
         x[i]=input.nextInt();
      }
      // b) print out the first array
      for (i=0; i<x.length; i++)
         System.out.print(x[i] + " ");
      
      
      //Sort the array
      System.out.println();
      for (start=0;start<x.length;start++)
      {
         int tempIndex=start;
         for (int j=start+1; j<x.length; j++)
            if (x[j]<x[tempIndex])
               tempIndex=j;
         int smallerNum = x[tempIndex];
         x[tempIndex]=x[start];
         x[start]=smallerNum;
         System.out.print(x[start] + " ");
      }
      
      
     input.close();
   }
}
