public class A {
	public void m() {
		System.out.println("A.m()");
	}
}

/*
a) Jego kompilacja zakończy się błędem (metody odziedziczone z klasy nadrzędnej nie mogą obsłużyć implementacji interfejsu w klasie podrzędnej)
b) Jego kompilacja zakończy się błędem ( konflikt w klasie B związany z nadpisaniem metody m)
c) Jego kompilacja i uruchomienie metody main uda się, na ekranie pojawi się: A.m()
d) Jego kompilacja i uruchomienie metody main uda się, na ekranie pojawi się: I.m()
*/
