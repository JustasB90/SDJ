import java.util.Scanner;
public class GradeConversion
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Type in the grade ");
      int grade = input.nextInt();
      
      switch (grade)
      {
         case -3 :
            System.out.println("The grade is F");
            break;
         case 0 :
            System.out.println("The grade is Fx");
            break;
         case 2 :
            System.out.println("The grade is E");
            break;
         case 4 :
            System.out.println("The grade is D");
            break;
         case 7 :
            System.out.println("The grade is C");
            break;
         case 10 :
            System.out.println("The grade is B");
            break;
         case 12 :
            System.out.println("The grade is A");
            break;
         default :
            System.out.println("Invalid grade");
      }
    input.close();   
   }
}
