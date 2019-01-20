class A
{
  String s = "A";
  void n() { System.out.print(s + "A.n "); }
  void m() { System.out.print(s + "A.m "); }
public
  static void main(String[] args)
  {
    A a1 = new C(), a2 = new D();
    a1.m();
    a2.m();
  }
}