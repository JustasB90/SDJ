import java.util.Scanner;
public class SolutionToEquation
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Type in a ");
      int a = input.nextInt();
      System.out.println("Type in b ");
      int b = input.nextInt();
      System.out.println("Type in c ");
      int c = input.nextInt();
      int D = (b*b)-(4*a*c);
      System.out.println(D);
      if (D < 0)
       System.out.println("The equation has no solutions.");
      if (D == 0)
         {
            int x;
            x = -b / (2*a);
            System.out.println("The solution is " + x);
         }
      if (D > 0)
         {
            double x1,x2;
            x1 = (-b + Math.sqrt(D)) / (2*a);
            x2 = (-b - Math.sqrt(D)) / (2*a);
            System.out.println("The solutions are " + x1 + " and " + x2);
         }
      input.close();
   }
}
