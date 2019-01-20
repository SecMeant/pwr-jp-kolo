package pakietA;

import pakiet.E;

public class A {
	private E e = E.A;
	public static void main(String[] args){
		e.m();
	}
}

/*
a) Jego kompilacja zakończy się błędem (błędy wystąpią w kodzie typu wyliczeniowego E)
b) Jego kompilacja zakończy się błędem (błędy wystąpią w kodzie klasy A)
c) Jego k ompilacja i uruchomienie metody main uda się, na ekranie pojawi się: null
d) Jego k ompilacja i uruchomienie metody main uda się, na ekranie pojawi się: c
*/
