public class A extends Thread {
	private static int i=0, j=0;

	public void inc() {
		i++; j++; System.out.pritnln(i-j);
	}
	synchronized public void dec() {
		i--; j--; System.out.println(i-j);
	}
	public void run(){
		if(i==0) while(true) inc();
			else while(true) dec();
	}

	public static void main(String[] args) throws InterruptedException {
		new A().start();
		new A().start();
	}
}

/*
a) Jego kompilacja zakończy się błędem
b) Jego kompilacja powiedzie się, jednak po uruchomieniu metody main zostanie wyrzucony wyjątek
c) Jego kompilacja powiedzie się. Po uruchomieniu metody main w nieskończoność będzie wypisywane 0
d) Jego kompilacja powiedzie się. Po uruchomieniu metody main w nieskończoność będą wypisywane wartości całkowite, choć trudno powiedzieć jakie.
*/
