public class A {
	public static void main(String[] args){
		A a = new A();
		Thread t1 = new Thread(()->{
			try{
				a.wait();
				System.out.println("1");
			}catch(InterruptedException e) {}
		});
		Thread t2 = new Thread(()->{
			a.notify();
			System.out.println("2");
		});

		t2.start();
		t1.start();
	}
}

/*
a) Jego kompilacja zakończy się błędem
b) J ego kompilacja powiedzie się, jednak po uruchomieniu metody main wyrzucony zostanie wyjątek java.lang.I llegalMonitorStateException
c) Jego kompilacja i uruchomienie metody main uda się.  Po wypisaniu 21 program skończy działanie
d) Jego kompilacja i uruchomienie metody main uda się. Po wypisaniu 2 program „zawiesi się”
*/
