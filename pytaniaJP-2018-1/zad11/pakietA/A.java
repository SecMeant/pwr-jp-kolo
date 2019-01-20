package pakietA;
public
class A implements I
{
public
  static void main(String[] args) { new A().m(new B()); }
  @Override public void m(B b) { Syste m.out.println(b.j); }
}