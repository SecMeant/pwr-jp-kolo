interface I
{
  default void m() { System.out.println("0"); }
}

interface J extends I
{
  void n();
}