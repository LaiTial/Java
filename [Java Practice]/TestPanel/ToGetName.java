import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ToGetName extends JFrame{
	
	public static ToGetName name;
	
	public ToGetName()
	{
		Container contentpane = this.getContentPane();
		contentpane.setLayout(new BoxLayout(contentpane, BoxLayout.Y_AXIS));
		
		JPanel p1, p2;
		p1 = new JPanel();
		contentpane.add(p1);
		p2 = new JPanel();
		contentpane.add(p2);
		
		p1.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("ÀÌ¸§: ");
		JTextField text = new JTextField(13);
		p1.add(label);
		p1.add(text);
		
		JButton button = new JButton("È®ÀÎ");
		p2.add(button);
		
		
		this.setSize(280, 130);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setTitle("ÀÌ¸§ ÀÔ·ÂÃ¢");
	}

	public void setInfo(Boolean info) {
		this.setVisible(info);
	}
	
	public static void main(String args[])
	{
		name = new ToGetName();
	}
}
