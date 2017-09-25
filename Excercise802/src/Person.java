//Create a Person class with attributes name and birthday(both string)
public class Person
{
   private String name;
   private String dateOfBirth;
   
   //Constructor
   
   public Person(String thename, String theDateOfBirth)
   {
      name = thename;
      dateOfBirth = theDateOfBirth;
   }     
   
   // Setters
   
   public void setName(String thename)
   {
      name=thename;
   }
   public void setDOB(String theDate)
   {
      dateOfBirth = theDate;
   }
   
   // Getters
   
   public String getName()
   {
      return name;
   }
   public String getDateOfBirth()
   {
      return dateOfBirth;
   }
   
   
}
