// zad 1

public class A {
  void m(int a) {}
  int m(String s) { return Integer.parseInt(s); }
  String m(int a) { return Integer.toString(a); }
}

//a) Jego kompilacja powiedzie się
//b) Jego kompilacja nie powiedzi e się (nieobsłużony wyjątek java.lang.N umberFormatException)
//c) Jego kompilacja nie powiedzie się (zła konwersja z int do String)
//d) Jego kompilacja nie powiedzie się (złe przeciążenie metody m)
