
//Justas Brazdeikis 13/9/2017
/* Write a program where you read an integer from keyboard and print out its last digit.
Example: the last digit of 234 is 4 and the last digit of -234 is also 4
Hint: Modulus 10 of a positive integer gives the last digit. 
Modulus 10 of a negative integer gives a negative value of the last digit.
*/
import java.util.Scanner;

public class modulus
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int i = 0;
      int j = 0;
      System.out.println("Type an integer");
      i = input.nextInt();
      if (i < 0)
         i = i * (-1);

      j = i % 10;

      System.out.println(j);
      input.close();
      
   }

}
