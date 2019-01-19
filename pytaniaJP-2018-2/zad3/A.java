// zad 3

public class A {
  final StringBuffer s = new StringBuffer("A");

	public StringBuffer getS() { return s; }

	public static void main(String[] args) {
			A a = new A();
			StringBuffer as = a.getS(); // 1
			as.append("...."); // 2
			as = new StringBuffer(); // 3
			System.out.println(as.toString());
	}
}

/*
a) Jego kompilacja nie pow iedzie się ( linia 1 : zmiennej finalnej nie można przypisać do referencji zmiennej lokalnej)
b) Jego kompilacja nie powiedzie się (linia 2 : zmienna lokalna stała się zmienną finalną, więc nie można użyć append , które ją zmieni)
c) Jego kompilacja nie powied zie się (linia 3 : ponowne p rzypisa nie wartości do zmiennej, która stała się zmienną finalną)
d) Jego kompilacja i uruchomienie metody main przebiegną bez przeszkód, na ekranie pojawi się pusta linia.
*/
