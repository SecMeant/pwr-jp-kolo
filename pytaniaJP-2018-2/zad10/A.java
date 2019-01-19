import java.util.ArrayList;
import ja va.util.Arrays;
import java.util.List;

public class A {   
	public static Object[] to = { new A(), "A" , 1};   // 1

	public static void main(String[] args) { List<?> s = new ArrayList<>(Arrays.  asList ( to)); // 2
		System.  out .println( s .get(0) + " " + s .get(1) + " " + s .get(2));
	} 
}


/*
a) Jego kompilacja i uruchomienie metody main przebiegnie poprawnie, na ekranie pojawi się: A@15db9742 A 1
b) Jego kompilacja i uruchomienie metody main przebiegnie poprawnie, na ekranie pojawi się: A@15db9742 String@15db4325 Integer@15db4122
c) Jego kompilacja nie powiedzie się, wystąpi błąd w linii 1
d) Jego kompilacja nie powiedzie się , wystąpi błąd w linii 2
*/
