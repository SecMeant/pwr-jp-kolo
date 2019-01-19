public abstract class A implements I {
	public static void main(String[] args) { 
		A a = new B();
	} 
}


/*
a) Jego kompilacja i uruchomienie metody main przebiegnie poprawnie
b) Jego kompilacja nie powiedzie się (n iepoprawny kod w klasie A)
c) Jego kompilacja nie powiedzie się (niepoprawna deklaracja klasy B)
d) Jego kompilacja nie powiedzie się (niepoprawna deklaracja interfejsu I)
*/
