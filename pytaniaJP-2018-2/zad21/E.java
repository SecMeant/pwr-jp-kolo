package pakiet;

public enum E implements I {
	A("c"), B("b");

	private String s;
	E(String s) { this.s = s; }

	@Override
	public void m() {
		System.out.println(s);
	}
}

/*
a) Jego kompilacja zakończy się błędem (błędy wystąpią w kodzie typu wyliczeniowego E)
b) Jego kompilacja zakończy się błędem (błędy wystąpią w kodzie klasy A)
c) Jego k ompilacja i uruchomienie metody main uda się, na ekranie pojawi się: null
d) Jego k ompilacja i uruchomienie metody main uda się, na ekranie pojawi się: c
*/
