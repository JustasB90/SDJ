
/*
 *1) Write a program that creates an integer array and assign some values to it using keyboard input
 2)Print out the smallest positive number from the array
 3) Count and print out the number of positive two-digit numbers in the array
 4) For each element in the array count and print out the number of elements in the array with the same value. 
 */
import java.util.Scanner;

public class ArrayThingy
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int[] array = new int[5];
      int i;
      for (i = 0; i < array.length; i++)
      {
         System.out.println("Type an integer");
         array[i] = input.nextInt();
      }

      // Smallest positive number

      int smallest = Integer.MAX_VALUE;
      for (i = 0; i < array.length; i++)
      {
         if (array[i] < smallest)
            if (array[i] > 0)
               smallest = array[i];
      }
      System.out.println("The smallest positive number is " + smallest);
      input.close();

      // Counting positive two digit numbers
      int c = 0; // counter
      for (i = 0; i < array.length; i++)
      {
         int j = array[i] % 100;
         if (j > 0)
            if (j == array[i])
               c++;
      }
      System.out.println("The number of positive two digit integers is " + c);

      // Printing out the array not working good
      int count = 0;
      int j = 0;
      for (i = 0; i < array.length; i++)
      {
         count = 0;
         for (j = 0; j < array.length; j++)
         {
            if (array[j] == array[i])
               count++;
         }
         System.out.println("index " + i + ": " + count
               + " elements with the value of " + array[i]);
      }
   }

}
