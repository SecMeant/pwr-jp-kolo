public class A {

	public static synchronized void m1() {
	}

	public synchronized void m2() {
	}

}

/*
a) Jego kompilacja nie powiedzie się (nie można synchronizować metod statycznych)
b) Jego komp ilacja przebiegnie poprawnie. Jeśli powstanie obiekt klasy A i wątki korzystające z jego metod, to przy próbie wykonania w nich którejkolwiek z tych metod pojawi się wyjątek java.lang.I llegalStateException
c) Jego kompilacja przebiegnie poprawnie. Jeśli po wstanie obiekt klasy A i wątki korzystające z jego metod, to przy próbie równoczesnego wykonania którejkolwiek z tych metod dojdzie do synchronizacji
d) Jego kompilacja przebiegnie poprawnie. Jeśli powstanie obiekt klasy A i wątki korzystające z jego metod , to do synchronizacji dojdzie jedynie przy próbie równoczesnego wykonania tej samej metody
   ( tj. przy próbie równoczesnego wykonania przez wątki metody m2() lub przy próbie równoczesnego wykonania przez wątki metody m1 ())

*/
