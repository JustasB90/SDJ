import java.util.Scanner;
public class GetVowel
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Type in your favorite word ");
      String word = input.nextLine();
      System.out.println("Type in a vowel ");
      char c = input.next().charAt(0);
      
      switch (c)
      {
         case 'a':
         System.out.println(word);
         break;
         
         case 'e':
         System.out.println(word);
         break;
         
         case 'i':
         System.out.println(word);
         break;
         
         case 'o':
         System.out.println(word);
         break;   
         
         case 'u':
         System.out.println(word);
         break; 
         
         case 'y':
         System.out.println(word);
         break; 
         
         default : 
         System.out.println("No vowel given");
         
      }
    input.close();
    }
}   
   
         


