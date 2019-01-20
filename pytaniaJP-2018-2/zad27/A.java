import java.io.*;
import java.net.*;

public class A {
	public static void main(String[] args) throws IOException {
		String line;
		ServerSocket s = new ServerSocket(2000);
		Socket sa = s.accept();
		InputStreamReader is = new InputStreamReader(sa.getInputStream());
		BufferedReader in = new BufferedReader(is);
		PrintWriter out = new PrintWriter(sa.getOutputStream(), true);
		while( !(line = in.readLine()).equals("BYE")) {
			out.println(line);
		}

		sa.close();
		s.close();
	}
}

/*
a) Jego kompilacja zakończy się błędem w linii 1
b) Jego kompilacja zakończy się błędem w linii 2
c) Jest to poprawny kod serwera echa, obsługującego na raz jedno połączenie, kończącego działa nie po otrzymaniu tekstu "BYE"
d) Jest to poprawny kod serwera echa, obsługującego na raz jedno połączenie, kończącego działanie po otrzymaniu tekstu innego niż "BYE"
*/
