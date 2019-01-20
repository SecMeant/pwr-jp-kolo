public
class A
{
  void k(J j) { j.m(); }
public
  static void main(String[] args)
  {
    A a = new A();
    a.k(() -> { System.out.println("1"); });
  }
}