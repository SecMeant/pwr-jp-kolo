import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
class C implements Comparator<Integer>
{
  @Override 
  public int compare(Integer o1, Integer o2) { return o1 - o2; }
}

public class A
{
public
  static void main(String[] args)
  {
    List < ? > l = new LinkedList<Integer>();
    // 2
    Collections.sort(l, new C());
    // 3
  }
}