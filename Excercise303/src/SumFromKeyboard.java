import java.util.Scanner;
public class SumFromKeyboard
{
   public static void main(String[] args)
   {
      int i1,i2,i3,sum,product;
      
      Scanner input = new Scanner(System.in);
      System.out.println("Type in the first integer ");
      i1= input.nextInt();
      System.out.println("Type in the second integer ");
      i2= input.nextInt();
      System.out.println("Type in the third integer ");
      i3= input.nextInt();
      sum=i1+i2+i3;
      product=i1*i2*i3;
      System.out.println("The sum of the integers is " + sum);
      System.out.println("The product of the integers is " + product);
   }
}
