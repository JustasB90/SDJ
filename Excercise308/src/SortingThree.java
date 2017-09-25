import java.util.Scanner;
public class SortingThree
{
   public static void main(String[] args)
   {
       Scanner input = new Scanner(System.in);
       System.out.println("Type in the first integer ");
       int a = input.nextInt();
       System.out.println("Type in the second integer ");
       int b = input.nextInt();
       System.out.println("Type in the third integer ");
       int c = input.nextInt();
       
       if (a<b && a<c)
          {
          if (b<c)
             System.out.println(a + ", " + b + ", " + c);
          else
             System.out.println(a + ", " + c + ", " + b);
          }
       if (b<a && b<c)
          {
          if (a<c)
             System.out.println(b + ", " + a + ", " + c);
          else
             System.out.println(b + ", " + c + ", " + a);
          }
       if (c<a && c<b)
          {
          if (a<b)
             System.out.println(c + ", " + a + ", " + b);
          else
             System.out.println(c + ", " + b + ", " + a);
          }
       input.close();
   }
}
