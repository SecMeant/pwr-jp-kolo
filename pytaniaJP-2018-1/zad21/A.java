import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class A {

	public static void main(){
		JButton btnNewButton = new JButton("1");
		btnNewButton.addMouseListener(new MouseAdapter() {
		  @Override 
		  public void mouseClicked(MouseEvent e) 
		  { System.out.print("C "); }
		  
		  @Override 
		  public void mousePressed(MouseEvent e)
		  {
		    System.out.println("P");
		  }
		  @Override 
		  public void mouseReleased(MouseEvent e)
		  {
		    System.out.println("R ");
		  }

		});
	}

}