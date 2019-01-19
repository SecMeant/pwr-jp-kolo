public class A {
	static String s1 ; 
	static String s2 ; 

	public static void main(String args[]) { 
		s2 = s1 + s2 ; 
		System.out.println(s2); 
	} 
}

/*
a) Jego kompilacja nie powiedzie się
b) Jego kompilacja przebiegnie poprawnie, ale przy próbie uruchomienia pojawi się wyjątek
c) Jego kompilacja i uruchomienie przebieg nie poprawnie, na ekranie pojawi się pusta linia
d) Jego kompilacja i uruchomienie przebiegnie poprawnie, na ekranie pojawi się napis nullnull
*/
