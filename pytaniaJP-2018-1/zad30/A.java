import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class A {
	public static void main(String[] args) throws MalformedURLException {
		String ftpurl = "ftp://user:password@server.com/projekty /plik.zip ";
				try {
				  URL url = new URL(ftpurl);// 1
				  URLConnection conn = url.openConnection();// 2
				  InputStream inputStream = conn.getInputStream();
				}
				catch(IOException ex)
				{
				  ex.printStackTrace();
				}
	}
}