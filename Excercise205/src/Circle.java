
public class Circle
{
   public static void main(String[] args)
   {
      double radius;
      double circumference;
      double area;
      radius = 22.5;
      circumference = 2 * Math.PI * radius;
      area = Math.PI * Math.pow(radius,2);
      System.out.println("The circumference is " + circumference);
      System.out.print("The area is " + area);
   }
}
