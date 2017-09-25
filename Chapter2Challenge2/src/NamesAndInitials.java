//Chapter 2 Challenge 2 Justas Brazdeikis 29/8/2017
public class NamesAndInitials
{
   public static void main(String[] args)
   {
      String firstName, middleName, lastName;
      char firstInitial, middleInitial, lastInitial;
      firstName = "Justas";
      middleName = "None";
      lastName = "Brazdeikis";
      firstInitial = firstName.charAt(0); //firstName.substring(0) would return string instead of char
      middleInitial = middleName.charAt(0);
      lastInitial = lastName.charAt(0);
      System.out.println(firstName);
      System.out.println(middleName);
      System.out.println(lastName);
      System.out.println(firstInitial);
      System.out.println(middleInitial);
      System.out.println(lastInitial);
    }
}
