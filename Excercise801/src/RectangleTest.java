// Test for the Rectangle class
public class RectangleTest
{
   public static void main(String[] args)
   {
      Rectangle rekt = new Rectangle(10.0, 20.0);
      System.out.println(rekt.getLength());
      System.out.println(rekt.getWidth());
      System.out.println(rekt.getArea());

      rekt.setLength(5.0);
      rekt.setWidth(10.0);
      System.out.println(rekt.getArea());
   }

}
