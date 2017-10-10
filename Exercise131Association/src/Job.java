
public class Job
{
   private String title;
   private double salary;
   public Person employee;
   
   public Job(String title, double salary, Person employee)
   {
      this.title=title;
      this.salary=salary;
      this.employee=employee;
   }
   
   public Job(String title, double salary)
   {
      this.title=title;
      this.salary=salary;
      this.employee= new Person(null);
   }
   public double getSalary()
   {
      return salary;
   }
   
   public String getTitle()
   {
      return title;
   }
   public Person getEmployee()
   {
      return employee;
   }
   public void setSalary(double salary)
   {
      this.salary=salary;
   }
   public boolean isAvailable()
   {
      boolean available;
      if (employee==null)
         available=true;
      else
         available=false;
      return available;
   }
   
   public void hire(Person employee)
   {
      if (isAvailable()==true)
         this.employee=employee;
      
   }
   public void fire()
   {
      this.employee=null;
   }
   public String toString()
   {
      return "The person is: "+employee+", the salary is: "+salary+", the job title is: "+title; 
   }
   
   public boolean equals(Job input)
   {
      boolean status;
      if (getTitle()==input.getTitle() && getSalary()==input.getSalary() && employee==input.employee)
         status=true;
      else 
         status=false;
      return status;
   }
}   
