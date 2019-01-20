import javax.swing.*;
import java.awt.*;

public class Ramka extends JFrame {
	
	public static void main(String[] args){
		Ramka r = new Ramka();
		r.pack();
		r.setVisible(true);
	}

	public Ramka() {
		add(new JButton("1"));
		getContentPane().add(new JButton("2"), BorderLayout.LINE_START);
		getContentPane().setLayout(new FlowLayout());
	}
}

/*
Pyatnie: jak wyglada wynik wykonania ponizszego (powyzszego w tym przypadku) kodu
*/
