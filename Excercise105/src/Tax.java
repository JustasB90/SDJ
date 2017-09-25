//Excercise 105 28/08/2018 Justas Brazdeikis Calculate the total price given the base price and tax.
public class Tax
{
 public static void main(String[] args)
 {
  int Price1,Price2,Price3;
  double tax, total1,total2,total3;
  Price1=80;
  Price2=140;
  Price3=230;
  tax=0.25;
  total1=Price1 + Price1*tax;
  total2=Price2 + Price2*tax;
  total3=Price3 + Price3*tax;
  System.out.println("Total price for the first item is " + total1);
  System.out.println("Total price for the second item is " + total2);
  System.out.println("Total price for the first item is " + total3);
 }
}
