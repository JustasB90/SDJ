
public class TestClass
{
   public static void main(String[] args)
   {
      Member m1= new Member("John", "qwerty");
      MyDate d1= new MyDate();
      Post p1 = new Post("Hello", m1, d1);
      System.out.println(p1);
      
      Member m2=new Member("Tim", "qwerty");
      MyDate d2=new MyDate();
      Post p2= new Post("Yo" , m2,d2);
      Forum f1= new Forum("Testing");
      f1.addPost(p1);
      f1.addPost(p2);
      System.out.println(Forum.postCount);
      
      
      f1.addPost(p1);
      
      System.out.println(f1.getPostsBy("John"));
      
      
   }
}
