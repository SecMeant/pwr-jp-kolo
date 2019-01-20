public class A
{
  static int i = 0;
public
  static void main(String[] args) throws InterruptedException
  {
    Thread t1 = new Thread(() -> {
      while (i < 1000)
        i++;
    });

    Thread t2 = new Thread(() -> { t1.join(); });
    t2.start();
    t1.start();
  }
  
}