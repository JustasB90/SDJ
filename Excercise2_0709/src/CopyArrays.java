//The variables 'numberArray1' and 'numberArray2' reference arrays
//that each have 100 elements. Write code that copies the values 
// in numberArray1 to numberArray2.  Justas Brazdeikis 7/9/2017
public class CopyArrays
{
   public static void main(String[] args)
   {
      int[] numberArray1;
      int[] numberArray2;
      numberArray1 = new int[100];
      numberArray2 = new int[100];
      int i;
      for (i=0; i<numberArray1.length; i++)
      {
         numberArray1[i] = i*2 ;
      }
      i=0;
      for (i=0; i<numberArray2.length; i++ )
      {
         numberArray2[i]=numberArray1[i];
         System.out.println(numberArray2[i]);
      }
      
   }
}
