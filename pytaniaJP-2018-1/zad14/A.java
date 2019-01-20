import java.io.FileInputStream;
import java.io.IOException;

class E1 extends Exception
{
} 

class E2 extends E1
{
}

public class A
{
public
  void m() throws E1, E2, IOException
  {
    FileInputStream is = new FileInputStream("in.txt");
    is.close();
  }
public
  static void main(String[] args)
  {
    A a = new A();
    try {
      a.m();
    } catch (IOException | E2 | E1 e) {
    }
  }
}