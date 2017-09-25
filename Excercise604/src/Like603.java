/*Modify 603 such that you declare and initialise an integer variable start to 0,
 * change c) loop finding the index of smallest element to start from the value of the variable start instead of 0
 * and d) to swap the smallest element with the element with the element on index start and print out the list again
 * The output should be exactly as in the previous excercise
 * Justas Brazdeikis 12/9/2017
 */
import java.util.Scanner;
public class Like603
{
   public static void main(String[] args)
   {
      Scanner input= new Scanner(System.in);
      int[] x = new int[10];
      int i,start=0;
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
      while (start<x.length)
      {
         if (x[start]<smallest)
         {
            smallest=x[start];
            j=start;
         }
       start++;     
      }
      start=0;
      
      
      
      System.out.println();
      System.out.println("The smallest value is " + smallest + " and it's index is " + j);
     input.close(); 
     //d
     int [] y = new int[10];
                
     for (i=0;i<x.length; i++)
     {
      if (i==0)
         y[i]=smallest;
      else if (i==j)
        y[i]=x[start];
      else
         y[i]=x[i];
        
     System.out.print(y[i] + " ");   
     }
        
   }

}

