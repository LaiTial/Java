package tem;

import javax.swing.*;

public class Temperature extends JFrame{

	public Temperature()
	{
		JPanel s = new JPanel();
		this.add(s);
		
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("¿Âµµ º¯È¯±â");
		
		JLabel s1 = new JLabel("È­¾¾ ¿Âµµ");
		s.add(s1);
		
		JTextField t1 = new JTextField(15);
		s.add(t1);
		
		JLabel s2 = new JLabel("¼·¾¾ ¿Âµµ");
		s.add(s2);
		
		JTextField t2 = new JTextField(15);
		s.add(t2);
		
		JButton button = new JButton("º¯È¯");
		s.add(button);
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Temperature frame = new Temperature();
		
	}

}
