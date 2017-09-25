//Excercise 221 29/8/2017 Justas Brazdeikis; Program shows string length and changes the name to upper case

public class StringLength 
{
   public static void main (String[] args)
   {
      String name = "Herman";
      int stringSize;
      
      stringSize = name.length(); //length function gets the length and it is assigned to variable stringSize
      String bigName = name.toUpperCase(); //changes Herman to HERMAN
      System.out.println(bigName + " has " + stringSize + " characters.");
      
   }
}