public
class A implements I
{
  A()
  {
    I.i = 2;
    // 2
  }
public
  static void main(String[] args)
  {
    A a = new A();
    a.m();
  }
  @Override 
  public void m() { System.out.println(I.i); }
}

interface I
{
  static int i = 1;
  // 1
  void m();
}