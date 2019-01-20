import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
	JLabel l;
	JButton b;

	public static void main(String[] args){
		JFrame r = new JFrame();
		r.getContentPane().add(new Panel());
		r.pack();
		r.setVisible(true);
	}

	public Panel() {
		l = new JLabel("<html>1<br/>2</html>");
		add(l);
		b = new JButton("1");
		add(b);
		b.addActionListener(a -> {this.l.setText("");});
	}
}

// Pytanie: Jak wyglada okno
