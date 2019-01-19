// zad 5

public class A{
	private int i = j;
	private static int j = 1;

	public static void main(String args[]){
		System.out.println((new A()).i);
	}
}

/*
a) Jego kompilacja nie powiedzie się ( zabroniony dost ęp do z miennej prywatnej klasy A)
b) Jego kompilacja nie powiedzie się ( źle zainicjalizowana zmienn a i)
c) Jego kompilacja i uruchomienie metody main przebiegnie poprawnie, na ekranie pojawi się 1
d) Jego kompilacja i uruchomienie metody main przebiegnie popraw nie, na ekranie pojawi się 0
 * */
