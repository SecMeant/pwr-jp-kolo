class C extends B<Object>
{
} 
class B<U> extends A<T>
{
} 
public class A<T>
{
  public T t;
public
  static void main(String[] args)
  {
    A <?> a = new C();
    System.out.println(a);
  }
}