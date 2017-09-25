/* Use a loop to read 5 integers from keyboard and store them into an array. Insert some statements
 * after this to calculate the sum, the average, the smallest and largest value and print to screen.
 * Justas Brazdeikis 9/11/2017
 */
import java.util.Scanner;
public class FiveNumbers
{
   public static void main(String[] args)
   {
      Scanner input= new Scanner(System.in);
      int smallest=Integer.MAX_VALUE;
      int largest=Integer.MIN_VALUE;
      int i,sum=0;
      double average=0.00;
      int[] numArray;
      numArray= new int[5];
      for (i=0; i<numArray.length; i++)
      {
         System.out.println("Type an integer");
         numArray[i]= input.nextInt();
         
         sum+=numArray[i];
         average=sum/(i+1);
         
         if (numArray[i]<smallest)
            smallest=numArray[i];
         
         if (numArray[i]>largest)
            largest=numArray[i];
      }
      
      System.out.println("The sum of the integers is " + sum);
      System.out.println("The average of the integers is " + average);
      System.out.println("The smallest of  the integers is " + smallest);
      System.out.println("The largest of the integers is " + largest);
      input.close();
   }
}
