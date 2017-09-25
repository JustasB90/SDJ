/* Write a program that
 * a) reads 4 integers from keyboard and stores them into an array (array1)
 * b) read 4 more integers from keyboard and stores them into another array(array2)
 * c)uses a loop to check if the two arrays are identical.
 * Justas Brazdeikis 12/9/2017
 */
import java.util.Scanner;
public class EqualArrayCheck
{
   public static void main(String[] args)
   {
      Scanner input= new Scanner(System.in);
      int i,j=0;
      // a)
      int [] array1= new int[4];
      for (i=0; i<array1.length; i++)
      {
         System.out.println("Type an integer to array1");
         array1[i]=input.nextInt();
      }
      //b
      int [] array2=new int[4];
      for (i=0; i<array2.length; i++)
      {
         System.out.println("Type an integer to array2");
         array2[i]=input.nextInt();
      }
      //c
      for (i=0; i<array1.length; i++)
      {
         if (array1[i]==array2[i])
         j++;   //counts the number of identical elements
      }
      if (j==array1.length) //if number of identical elements is the same as array length, arrays are identical
         System.out.println("array1 and array2 are identical");
      else
         System.out.println("array1 and array2 are NOT identical");
      input.close();
   }
}
