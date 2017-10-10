//Create a Person class with attributes name and birthday(both string)
public class Person
{
   private String name;
   private MyDate birthday;
   
   //Constructor
   
   public Person(String name, MyDate birthday )
   {
      this.name=name;
      this.birthday=birthday;
   }
   
   public Person(MyDate birthday)
   {
      this.name=null;
      this.birthday=birthday;
   }
   
   public void setName(String name)
   {
      this.name=name;
   }
   
   public String getName()
   {
      return name;
   }
   
   public MyDate getBirthday()
   {
      return birthday;
   }
   
   public int getAge()
   {
      MyDate today= new MyDate();
      int age = today.getYear() - birthday.getYear();
      return age;
   }
   
   public String toString()
   {
      return "The name is: " + name +" and the birthday is: "+birthday;
   }
   
   public boolean equals(Person input )
   {
      boolean status;
      if (getName()==input.name && input.getBirthday().equals(getBirthday()))
         status=true;
      else 
         status=false;
      
      return status;
         
   }
}