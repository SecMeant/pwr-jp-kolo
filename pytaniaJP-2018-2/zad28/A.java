import java.rmi.*;
import java.rmi.registry.*;
import java.io.Serializable;

import java.io.*;

interface I extends Remote {
	public void m() throws RemoteException;
}

public class A implements I, Serializable {
	public void m() {System.out.println("A");}

	public static void main(String[] args) throws RemoteException, IOException{
		Registry r = LocateRegistry.createRegistry(3000);
		A a = new A();
		r.rebind("A", a);
		System.in.read();
	}
}

/*
a) Po kompilacji i uruchomieniu klas A i B w osobnych konsolach, na konsoli klasy A wyświetli się napis A . 
b) Po kompilacji i uruchomieniu klas A i B w osobnych konsolach, na konsoli klasy B wyświetli się napis A .
c) Po kompilacji i uruchomieniu klas A i B w osobnych konsolach, na konsoli klasy B wyświetli się komun ikat o wyjątku java.rmi.UnmarshalException
d) Jego kompilacja zakończy się błędem
*/
