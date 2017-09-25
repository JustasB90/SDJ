import java.util.Scanner;
public class TwoIntegers
{
  public static void main(String[] args)
  {
     int a,b,sum,remainder;
     double division;
     
     
     
     Scanner input = new Scanner(System.in);
     System.out.println("Type in the first integer");
     a=input.nextInt();
     System.out.println("Type in the second integer");
     b=input.nextInt();
     
     
     
     if (a<b)
        {
        System.out.println(a + " " + b);
        sum=a+b;
        System.out.println("The sum is " + sum);
        if (a!=0)
           {   
           division=b/a;
           System.out.println("The division is " + division);
           remainder=b%a;
           System.out.println("The remainder division is " + remainder);
           }
        else 
           System.out.println("Cannot divide by 0");
        }
      else
        {
        System.out.println(b + " " + a);
        sum=a+b;
        System.out.println("The sum is " + sum);
        if (b!=0)
           {
           division=a/b;
           System.out.println("The division is " + division);
           remainder=a%b;
           System.out.println("The remainder division is " + remainder);
           }
        else 
           System.out.println("Cannot divide by 0");
        }
     
     
         
  }
}
