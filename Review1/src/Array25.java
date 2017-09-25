
/*
 * 1.Declare and create an array of 25 integers called myNums. Initialize the array by setting the ith element to the value 2*i
 * 2.Print all the elements of myNums using each of the following approaches : a) the Arrays class b) a for-loop c) an enhanced for-loop
 * 3. Swap 5th with 10th
 * 4. Declare and create a 2D array of ints called cells with 4 rows and 8 colums.
 * Using loops, set the value of each element to be equal to the product of row and colum.
 */
import java.util.Arrays;

public class Array25
{
   public static void main(String[] args)
   {
      int[] myNums = new int[25];
      int i;
      for (i = 0; i < myNums.length; i++)
      {
         myNums[i] = i * 2;
      }

      // Print out the array using the Arrays class
      printWithArraysClass(myNums);

      // System.out.println(Arrays.toString(myNums));

      // Print out the array using the for loop

      for (i = 0; i < myNums.length; i++)
      {
         System.out.print(myNums[i] + " ");
      }
      System.out.println();

      // Print out the array using enchanced for loop

      for (int j : myNums)
         System.out.print(j + " ");

      // Swap the 5th element of myNums with the 10th element
      System.out.println();
      int temp = myNums[5];
      myNums[5] = myNums[10];
      myNums[10] = temp;

      for (int j : myNums)
         System.out.print(j + " ");

      // Excercise number 4
      System.out.println();
      System.out.println();
      System.out.println();
      int[][] twoD = new int[4][8];
      int row, column;

      for (row = 0; row < 4; row++)
      {
         for (column = 0; column < 8; column++)
         {
            twoD[row][column] = row * column;
            System.out.print(twoD[row][column] + " ");
         }
         System.out.println();
      }

   }

   private static void printWithArraysClass(int[] myNums)
   {
      System.out.println("Printing with arrays class ");
      System.out.println(Arrays.toString(myNums));
   }
}
