//Creates a Rectangle class

public class Rectangle
{
   private double length;
   private double width;

   /**
    * Constructor
    */

   public Rectangle(double len, double w)
   {
      length = len;
      width = w;
   }
   public double getLength()
   {
    return length;  
   }
   public double getWidth()
   {
    return width;
   }
   public double getArea()
   {
      return length * width;
   }
   public void setLength(double l)
   {
      length = l;
      System.out.println("The length has been changed");
   }
   public void setWidth(double w)
   {
      width = w;
      System.out.println("The width has been changed");
   }
}