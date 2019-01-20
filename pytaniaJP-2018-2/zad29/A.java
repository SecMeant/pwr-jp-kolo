public class A {
	A() {
	}

	A(int i){
		System.out.println("int");
	}
	A(Integer i){
		System.out.println("Integer");
	}

	public static void main(String[] args) throws IOException {
		Integer j = 10;
		A a = new A(j);
	}
}

/*
a) Jego kompilacja uda się. Po uruchomieniu metody main na ekranie pojawi się Integer
b) Jego kompilacja uda się. Po uruchomieniu metody main na ekranie pojawi się int
c) Jego kompilacja zakończy się błędem (źle zadeklarowane konstruktory)
d) Jego kompilacja zakończy się błędem (złe wywołanie konstruktora)
*/
