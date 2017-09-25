/*Write a program that asks the user to enter todays sales for five stores. The program should
 * then display a bar chart comparing each store's sales. Create each bar in the bar chart by 
 * displaying a row of asterisks. Each asterisk should represent $100 of sales. 
 * Justas Brazdeikis 6/9/2017
 */
import java.util.Scanner;
public class SalesComparison
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int i,j,salesStore1,salesStore2,salesStore3,salesStore4,salesStore5;
      
      System.out.println("Enter the sales for store 1");
      salesStore1=input.nextInt();
      System.out.println("Enter the sales for store 2");
      salesStore2=input.nextInt();
      System.out.println("Enter the sales for store 3");
      salesStore3=input.nextInt();
      System.out.println("Enter the sales for store 4");
      salesStore4=input.nextInt();
      System.out.println("Enter the sales for store 5");
      salesStore5=input.nextInt();
      
      System.out.println("SALES BAR CHART");
      
      j=salesStore1/100;
      System.out.print("Store 1: ");
      for (i=1; i<=j; i++)
      {
         System.out.print("*");
      }
      System.out.println();
      //////////////////
      j=salesStore2/100;
      System.out.print("Store 2: ");
      for (i=1; i<=j; i++)
      {
         System.out.print("*");
      }
      System.out.println();
      //////////////////
      j=salesStore3/100;
      System.out.print("Store 3: ");
      for (i=1; i<=j; i++)
      {
         System.out.print("*");
      }
      System.out.println();
      //////////////////
      j=salesStore4/100;
      System.out.print("Store 4: ");
      for (i=1; i<=j; i++)
      {
         System.out.print("*");
      }
      System.out.println();
      /////////////////
      j=salesStore5/100;
      System.out.print("Store 5: ");
      for (i=1; i<=j; i++)
      {
         System.out.print("*");
      }
      
   input.close();   
   }
}
