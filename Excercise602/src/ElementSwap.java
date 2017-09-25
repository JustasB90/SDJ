//Modify 601 so i can swap the smallest element into index[0]
//Justas Brazdeikis 12/9/2017
import java.util.Scanner;
public class ElementSwap
{
   public static void main(String[] args)
   {
      Scanner input= new Scanner(System.in);
      int i,j=0;
      
      // Type in the array
      int [] array1= new int[4];
      for (i=0; i<array1.length; i++)
      {
         System.out.println("Type an integer to array1");
         array1[i]=input.nextInt();
      }
      //Find the smallest number in the array and "remember" it's index
      int smallest=Integer.MAX_VALUE;
      for (i=0; i<array1.length; i++)
      {
        if (array1[i]<smallest)
        {
           smallest=array1[i];
           j=i; //index of the smallest array
        }
        System.out.print(array1[i] + " ");
      }
      System.out.println(); 
      //Create an array with the smallest value in the index[0]
      
      int[] array2=new int[4];
      for (i=0; i<array2.length; i++)
      {
         if (i==0)
            array2[0]=smallest;
         else if (i==j)
            array2[i]=array1[0];
            else
               array2[i]=array1[i];
            
        System.out.print(array2[i] + " ");    
      }
      input.close();
   }
}
