import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class A implements I {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("out.tmp");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(new B());
		oos.close();
	}
}

/*
a) Jego kompilacja zakończy się błędem w linii 1
b) Jego kompilacja zakończy się błędem w linii 2
c) Jego kompilacja powiedzie się, jednak uruchomienia metody main zakończy się wyrzuceniem wyjątku java.io.N otSerializableException
d) Jego kompil acja i uruchomienie metody main powiedzie się
*/

