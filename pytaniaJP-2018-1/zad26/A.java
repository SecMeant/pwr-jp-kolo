import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class A
{
public
  static void main(String[] args) throws IOException
  {
    ServerSocket s = new ServerSocket(2000);
    // 1
    Socket sa = s.accept();
    Scanner in = new Scanner(sa.getInputStream());
    PrintWriter out = new PrintWriter(sa.getOutputStream(), true);
  
  do {
      String line = in.nextLine();
      // 2
      out.println(line);
    } while (!line.equals("BYE"));
    // 3
    sa.close();
  }
}