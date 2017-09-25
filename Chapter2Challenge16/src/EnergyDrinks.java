//Chapter 2 Challenge 16 29/8/2017 Justas Brazdeikis
public class EnergyDrinks
{
   public static void main(String[] args)
   {
      int customerNumber ;
      double buyRate, citrusRate, buyPeople, citrusPeople ;
      customerNumber=15000;
      buyRate=0.18;
      citrusRate=0.58;
      buyPeople=customerNumber*buyRate;
      citrusPeople=buyPeople*citrusRate;
      System.out.println("The number of people who buy drinks is " + buyPeople);
      System.out.println("The number of people who buy citrus drinks is " + citrusPeople);
   }
}
