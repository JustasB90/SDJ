import java.util.Scanner;
public class ValidationLoop
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int a;
      do
      {
         System.out.println("Type an integer from 10 to 25");
         a = input.nextInt();
      }while (a<10 || a>20);   
    input.close();  
   }
}
