/*Make a program doing the following

1)Declare an array with 4 elements of type int assigned to different non-zero values (e.g. 1, 2, 3, and 4, respectively as shown in the example run below).
2)Use a loop to print out all elements from the array (in the form shown in the example run below)
3)Swap elements such that the elements are reversed (i.e. the values from array[0] and array[3] are swapped and the values from array[1] and array[2] are also swapped). Make a general solution (using a loop) such that it also would work if the array length were not equal to 4 (in other words; swap the first element with the last, swap the second element with the second last and so forth).
4)Print out all elements again.
*/
public class SwappingArrays
{
   public static void main(String[] args)
   {
      // 1
      int[] array = new int[4];
      array[0] = 1;
      array[1] = 2;
      array[2] = 3;
      array[3] = 4;
      // 2
      int i, j;
      for (i = 0; i < array.length; i++)
         System.out.print(array[i] + " ");
      // 3
      System.out.println();
      j = 1;
      for (i = 0; i < (array.length / 2); i++)
      {
         int temp = array[array.length - j];
         array[array.length - j] = array[i];
         array[i] = temp;
         j++;

      }
      for (i = 0; i < array.length; i++)
         System.out.print(array[i] + " ");
   }
}
