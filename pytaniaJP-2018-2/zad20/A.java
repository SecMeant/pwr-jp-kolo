import java.util.Arrays;
import java.util.Collections;
import java.util.List;

enum E {
	B, D, C, A
}

public class A {
	public static void main(String[] args){
		List<E> l = Arrays.asList(E.values());
		Collections.sort(l);
		for(E o : l){
			System.out.print(o);
		}
	}
}

/*
a) Jego kompilacja zakończy się błędem
b) Jego kompilacja i uruchomienie metody main uda się , na ekranie pojawi się: BDCA
c) Jego k ompilacja i uruchomienie metody main uda się, na ekranie pojawi się: DCBA
d) Jego k ompilacja i uruchomienie metody main uda się, na ekranie pojawi się: A BCD
*/
