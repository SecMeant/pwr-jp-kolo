public
class A
{
  {
    System.out.print("A ");
  }

public class B
  {
  private B() { 
      System.out.print("A.B"); 
    };
  }

  public static void main(String[] args)
  {
    B b = new A().new B(); // 1
  }
}