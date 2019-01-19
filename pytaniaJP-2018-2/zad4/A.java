// zad 4

import java.util.*;

public class A<T> {
	final ArrayList<?> l = null;
	public A() { l = new ArrayList<T>(); }
	public A(int i) {}
	public void m() { System.out.println(l.isEmpty()); }
}


/*
a) Jego kompilacja nie powiedzie się ( zmienna finalna l nie zos tała zainicjowana we wszystkich konstruktorach)
b) Jego kompilacja nie powiedzie się ( zmienna finalna l została dwa razy zainicjalizowana)
c) Jego kompilacja nie powiedzie się ( źle zastosowano szablon w klasie A)
d) Jego kompilacja przebiegnie bez przeszkód
*/
