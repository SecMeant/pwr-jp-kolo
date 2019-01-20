import java.net.MalformedURLException;
import java.net.URL;

public class A {
	public static void main(String[] args) throws MalformedURLException {
		URL obj = new URL("http://www.pwr.edu.pl/index.dhtml");
		System.out.print(obj.getHost());
	}
}