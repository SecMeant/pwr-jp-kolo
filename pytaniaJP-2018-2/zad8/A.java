public abstract class A { // 1
	public A( int i){
		this();               // 2
	}

	public static void main(String[] args) { 
		A a = new B();        // 3
	} 
}
