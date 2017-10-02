//Tests MyDate class
public class MyDateTest
{
   public static void main(String[] args)
   {
      MyDate today = new MyDate(5,2,2020);
      System.out.println(today);
      System.out.println(today.isLeapYear());
      System.out.println(today.numberOfDaysInMonth());
      
      today.setDate(29, 2, 2020);
      System.out.println(today);
      System.out.println(today.getMonthName());
      today.stepForwardOneDay();
      System.out.println(today);
      today.stepForwardOneDay();
      System.out.println(today);
      
      today.stepForward(3);
      System.out.println(today);
      
      today.setDate(1, "March" , 1999);
      System.out.println(today);
      
      MyDate today2 = new MyDate(1,3,1999);
      System.out.println(today.equals(today2));
      
     System.out.println(today.copy());
   }
   
}
