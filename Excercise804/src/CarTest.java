//Tests Car class
public class CarTest
{
   public static void main(String[] args)
   {
      Car ferrari = new Car("Justas","Red", "BLZ420" );
      System.out.println(ferrari.getOwner());
      System.out.println(ferrari.getColor());
      
      System.out.println(ferrari.getRegNr());
      
      ferrari.setColor("Pink");
      ferrari.setOwner("Not me");
      ferrari.setRegNr("DXNX44");
      
      System.out.println(ferrari.getColor());
      System.out.println(ferrari.getOwner());
      System.out.println(ferrari.getRegNr());
      
      
   }
}
