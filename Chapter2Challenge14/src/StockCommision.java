//Chapter 2 Challenge 14 Justas Brazdeikis 29/8/2017
public class StockCommision
{
   public static void main(String[] args)
   {
      double pricePerShare , commissionRate , totalCommission,totalPrice;
      int shares;
      pricePerShare=25.50;
      commissionRate=0.02;
      shares=1000;
      totalCommission=pricePerShare*commissionRate*shares;
      totalPrice=shares*pricePerShare+totalCommission;
      System.out.println("The amount of the commision is $" + totalCommission);
      System.out.println("The total amount paid is $" + totalPrice);
      
   }
}
