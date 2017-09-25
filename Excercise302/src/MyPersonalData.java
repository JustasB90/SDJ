import java.util.Scanner;
public class MyPersonalData
{
   public static void main(String[] args)
   {
   String name,address;
   int age;
   
   Scanner input = new Scanner(System.in);
   System.out.println("What is your name?");
   name = input.nextLine();
   System.out.println("What is your age?");
   age= input.nextInt();
   
   input.nextLine(); //Consume the remaining newline!!! Need to learn about it !!!!!!
   
   System.out.println("What is your address?");
   address = input.nextLine();
   
   System.out.println("Your name is " + name + ", your age is " + age + ", your address is " + address);
   }
}
