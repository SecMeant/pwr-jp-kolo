class B extends A
{
  String s = "B";
  void n() { System.out.print(s + "B.n "); }
  void m() { n(); }
} class C extends A
{
  String s = "C";
  void m() { super.m(); }
} class D extends B
{
  String s = "D";
  void m() { super.m(); }
}