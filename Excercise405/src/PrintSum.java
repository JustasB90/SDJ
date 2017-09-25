import java.util.Scanner;
public class PrintSum
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int sum=0;
      double average = 0;
      for (int i=0; i<5; i++)
      {
       System.out.println("Type an integer: ");
       int value = input.nextInt();
       sum += value;
       average = sum / (i+1);
       
      }
      System.out.println("The sum is " + sum);
      System.out.println("The average is " + average);
      input.close();
   }
}
