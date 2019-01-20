interface I<T> {
	public T m();
}

abstract class B<U> {
	public abstract U m();
}

public class A extends B<A> implements I<B> {
	public static void main(String[] args){
		A a = new A();
		a.m();
	}

	@Override
	public A m() {
		return null;
	}
}

/*
a) Jego kompilacja zakończy się błędem (źle zadeklarowano interfejs I)
b) Jego kompilacja zakończy się błędem ( źle zadeklarowano klasę B)
c) Jego komp ilacja zakończy się błędem ( źle zadeklarowano klasę A) 
d) Jego kompilacja i uruchomienie metody main powiedzie się
*/
