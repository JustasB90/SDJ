/* In a program, you need to store the identification numbers of 10 employees (as integers)
 * and their weekly gross pay ( as double values).
 * a) Define two arrays that may be used in parallel to store 10 employee IDs and gross pay amounts.
 * b) Write a loop that uses these arrays to print each of the employees IDs and gross pay amounts.
 * Justas Brazdeikis 9/11/2017
 */
import java.util.Scanner;
public class Employees
{
   public static void main(String[] args)
   {
      Scanner input= new Scanner(System.in);
      int [] workerID= new int[10];
      double [] workerPay=  new double[10];
      int i;
      for (i=0;i<workerID.length;i++)
      {
         System.out.println("Type the " + (i+1) +" worker ID");
         workerID[i]=input.nextInt();
         System.out.println("Type the " + (i+1) + " worker gross pay");
         workerPay[i]=input.nextDouble();
               
      }
      
      for (i=0;i<workerID.length; i++)
      {
         System.out.println("Workers whose ID is " + (workerID[i]+1) + " pay is " + workerPay[i]);
      }
      input.close(); 
   }
}
