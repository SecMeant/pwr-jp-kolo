import java.util.HashMap;
import java.util.Map;

public class A {
	public static void main(String[] args){
		Integer i1 = 1, i2 = new Integer(1), i3 = new Integer(1);
		String s1 = "af", s2 = "be", s3 = new String("af");

		Map<String, Integer> si = new HashMap<String, Integer>();
		si.put(s1, i3);
		si.put(s2, i2);
		si.put(s3, i3);

		System.out.println(si.size());
	}
}

/*
a) Jego kompilacja zakończy się błędem 
b) Jego k ompilacja i uruchomienie metody main uda się , na ekranie pojawi się: 1
c) Jego k ompilacja i uruchomienie metody main uda się, na ekranie pojawi się: 2
d) Jego k ompilacja i uruchomienie metody main uda się, na ekranie pojawi się: 3
*/
