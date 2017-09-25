/*Write a program that asks the user to enter the amount that he or she has budgeted for a month. A loop should
 * then prompt the user to enter each of his or her expenses for the month and keep a running total. When the loop
 * finishes, the program should display the amount that the user is over or under budget.
 * Justas Brazdeikis 6/9/2017
 */ 
import java.util.Scanner;
public class BudgetBalance
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter your budget");
      int budget=input.nextInt();
      int expense=1;
      int balance=0;
      while (expense !=0)
      {
         System.out.println("Type in your expense. Press 0 to terminate");
         expense=input.nextInt();
         balance=budget-expense;
         budget=balance;
      }
      System.out.println("Your balance is " + balance);
      input.close();
   }
}
