import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		String a = "A", b, c = "A ", d = "A";
		Scanner sc = new Scanner(System.in);
		b = sc.nextLine();

		if (a.toString() == b.trim()) System.out.println("a.toString==b.trim");
		if (a.toString() == c.trim()) System.out.println("a.toString==c.trim");
		if (a.toString() == d.trim()) System.out.println("a.toString==d.tr im");

		if (a == b) System.out.println("a==b");
		if (a == c) System.out.println("a==c");
		if (a == d) System.out.println("a==d");

		if (a.compareTo(b) == 0) System.out.println("a.compareTo(b) ==0 ");
		if (a.compareTo(c) == 0) System.out.println("a.compareTo(c) ==0 ");
		if (a.compareTo(d) == 0) System.out.println("a.compareTo(d) ==0 ");
		sc.close();
  }
}

/*

Jaki będzie wynik działania poniższego kodu, jeśli po jego uruchomieniu użytkownik wprowadzi na standardowym wejściu literę A i naciśnie ENTER?

a)
a.toString==d.trim
a==d
a.compareTo(b) ==0
a.compareTo(d) ==0

b)
a.toString==c.trim
a.compareTo(b) ==0

c)
a.toString==c.trim
a.compareTo(b) ==0
a.compareTo(d) ==0

d)
a.compareTo(b) ==0
a.compareTo(d) ==0

*/
