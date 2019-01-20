public class A {
	static void m() {
		System.out.println("A.m()");
	}
	public static void main(String[] args){
		Thread t1 = new Thread(A::m);
		t1.start();
	}
}

/*
a) Jego kompilacja zakończy się błędem
b) Jego kompilacja powiedzie się, jednak po uruchomieniu metody main zostanie wyrzucony wyjątek
c) Jego kompilacja powiedzie się. Po uruchomieniu metody main na ekranie zostanie wypisane A.m()
d) Jego kompilacja powiedzie się. Po uruchomieniu metody main program zakończy swoje działanie (na ekranie nie zdąży się nic wypisać).
*/
