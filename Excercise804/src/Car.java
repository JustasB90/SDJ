//Create a class Car with color,owner,reg nr as string attribues
public class Car
{
   private String owner;
   private String color;
   private String regNr;

   // Constructor

   public Car(String own, String col, String reg)
   {
      owner = own;
      color = col;
      regNr = reg;
   }

   // Setters

   public void setOwner(String own)
   {
      owner = own;
   }

   public void setColor(String col)
   {
      color = col;
   }

   public void setRegNr(String reg)
   {
      regNr = reg;
   }

   // Getters

   public String getOwner()
   {
      return owner;

   }

   public String getColor()
   {
      return color;
   }

   public String getRegNr()
   {
      return regNr;
   }

}
