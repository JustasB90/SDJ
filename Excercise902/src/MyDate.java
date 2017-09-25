//Excercise 902
public class MyDate
{
   private int month, day, year;

   public MyDate(int day, int month, int year)
   {
      this.day = day;
      this.month = month;
      this.year = year;

   }

   // GETTERS

   public int getDay()
   {
      return this.day;
   }

   public int getMonth()
   {
      return this.month;
   }

   public int getYear()
   {
      return this.year;
   }

   // SETTER

   public void setDate(int day, int month, int year)
   {
      this.day = day;
      this.month = month;
      this.year = year;
   }

   public String toString()
   {
      return this.getDay() + "/" + this.getMonth() + "/" + this.getYear();
   }
}
