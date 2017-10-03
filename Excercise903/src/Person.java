
public class Person
{
   private String name;
   private MyDate birthday;
   
   
      public Person(String name, MyDate birthday)
      {
         this.name=name;
         this.birthday=birthday.copy();
      }  
      
      public String toString()
      {
         return "Person name is: " + name + " DOB is: " + birthday;
      }
      
      public String getName()
      {
         return name;
      }
      
} 
