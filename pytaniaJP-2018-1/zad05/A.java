public
class A
{
public
  static A() { s = s + "2"; }
  String s = "A";
public
  static void main(String[] args) { System.out.println(A.A().s); }
}