//The variable 'names' references an integer array with 20 elements
//Write a for loop that print out the array.
//Justas Brazdeikis 7/9/2017
public class ArrayInit
{
   public static void main(String[] args)
   {
      int[] names= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20} ;
      
      
      int i;
      for (i=0 ; i<names.length; i++)
         System.out.println(names[i] + " ");
   }
}
