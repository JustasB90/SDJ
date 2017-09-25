import java.util.Scanner;
public class GenderTest
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Type gender (M or F): ");
      String line = input.nextLine();
      char gender = line.charAt(0);
      System.out.println("Type in your age");
      int age = input.nextInt();
      
      if (gender == 'M' && age<18)
         System.out.println("Boy");
      if (gender == 'M' && age>=18)
         System.out.println("Man");
      if (gender == 'F' && age<18)
         System.out.println("Girl");
      if (gender == 'F' && age>=18)
         System.out.println("Woman");
      input.close();
   }
}
