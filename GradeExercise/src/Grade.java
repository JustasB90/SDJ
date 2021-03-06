public class Grade
{
   private String courseName;
   private int grade;

   public Grade(String courseName, int grade)
   {
      this.grade=grade;
      this.courseName=courseName;
   }

   public String getCourseName()
   {
      return courseName;
   }

   public int getGrade()
   {
      return grade;
   }

   public void setGrade(int grade)
   {
      this.grade=grade;
   }

   public String ToString()
   {
      return courseName + ", " + grade;
   }
}