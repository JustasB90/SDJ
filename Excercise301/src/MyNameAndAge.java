//30/8/2017 Justas Brazdeikis     Write an application that reads your name and age from the keyboard input and displays it on the screen.
import java.util.Scanner;
public class MyNameAndAge
{
  
   public static void main(String[] args)
  {
     String name;
     int age;
     
     Scanner input = new Scanner(System.in);
     
     System.out.println("What is your name?");
     name = input.nextLine();
     System.out.print("What is your age?");
     age = input.nextInt();
     input.close();
  }
}
