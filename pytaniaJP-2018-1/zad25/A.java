public
class A
{
  interface I
  {
    static void m() {}
    // 1
  }
public
  static void main(String[] args)
  {
    new B().m();
    // 2
  }
} class B implements A.I
{
public
  void m()
  {
    A.I.m();
    // 3
  }
}