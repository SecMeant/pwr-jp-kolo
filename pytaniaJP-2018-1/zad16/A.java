import java.util.List;

class C extends B
{
}

class B extends A
{
}

public class A
{
public static void m(List<? extends B> l)
{
  // 0
  l.add(new A());
  // 1
  l.add(new B());
  // 2
  l.add(new C());
  // 3
}
}