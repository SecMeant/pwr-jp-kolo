public class A
{
public
  static void main(String[] args) throws InterruptedException
  {
	Thread t1 = new Thread(new Runnable() {
		public void run() {
			while(true) {
				System.out.println("1");
			}
	    }
    });

	t1.start();
	Thread.sleep(100);
	t1.interrupt();	
  }
}