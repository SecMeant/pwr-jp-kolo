public class A {
	
	public static void m(int ... t){ // 1
		Object o = t[0]; int i = t[1]; // 2
	}

	public static void main(String[] args){
		m(new int[]{1,2,3});
	}
}


/*
a) Jego kompilacja zakończy się błędem w linii 1
b) Jego kompilacja zakończy się błędem w linii 2
c) Jego kompilacja zakończy się błędem w linii 3
d) Jego kompilacja i uruchomienie metody main przebiegnie poprawnie
*/
