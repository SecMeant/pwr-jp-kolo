import java.rmi.registry.*;
import java.rmi.*;

import java.io.IOException;

public class B {
	public static void main(String[] args) throws NotBoundException, IOException{
		Registry r = LocateRegistry.getRegistry(3000);
		((I) r.lookup("A")).m();
	}
}

/*
a) Po kompilacji i uruchomieniu klas A i B w osobnych konsolach, na konsoli klasy A wyświetli się napis A . 
b) Po kompilacji i uruchomieniu klas A i B w osobnych konsolach, na konsoli klasy B wyświetli się napis A .
c) Po kompilacji i uruchomieniu klas A i B w osobnych konsolach, na konsoli klasy B wyświetli się komun ikat o wyjątku java.rmi.UnmarshalException
d) Jego kompilacja zakończy się błędem
*/
