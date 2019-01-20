public
class A
{
  Integer i;
  void m(Integer i) { i = 12; }
public
  static void main(String[] args)
  {
    A a1 = new A(), a2 = new A();
    a1.m(a2.i);
    // 1
    System.out.println(a1.i + a2.i);
    // 2
  }
}