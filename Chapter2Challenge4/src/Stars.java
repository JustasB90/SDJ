// Chapter 2 Challenge 4 Justas Brazdeikis 29/8/2017
public class Stars
{
   public static void main(String[] args)
   {
      int i, j, k;
      for(i=1;i<=4;i++)  //line counter upward from * to *******
      {
         for(j=i;j<4;j++) //counts and prints the empty space
          {
           System.out.print(" ");
          }
         for(k=1;k<(i*2);k++) //counts and prints the star(s)
         {
          System.out.print("*");
         }
      System.out.println();  //jumps to the next line
      }
      
      
      for(i=3;i>=1;i--)  //Line counter downward from ***** to *
      {
         for(j=4;j>i;j--)
          {
            System.out.print(" ");
          }
         for(k=1;k<(i*2);k++)
          {
            System.out.print("*");
          }
      System.out.println();
      }
  }
}