//Excercise 903 
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
    //  String.format("%02d", this.getDay());   These format number into two digits
    //  String.format("%02d", this.getMonth());
      return String.format("%02d", this.getDay()) + "/" + String.format("%02d", this.getMonth()) + "/" + this.getYear();
   }
}
