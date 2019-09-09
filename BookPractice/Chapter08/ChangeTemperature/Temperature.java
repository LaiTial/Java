package tem;

import javax.swing.*;

public class Temperature extends JFrame{

	public Temperature()
	{
		JPanel s = new JPanel();
		this.add(s);
		
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("온도 변환기");
		
		JLabel s1 = new JLabel("화씨 온도");
		s.add(s1);
		
		JTextField t1 = new JTextField(15);
		s.add(t1);
		
		JLabel s2 = new JLabel("섭씨 온도");
		s.add(s2);
		
		JTextField t2 = new JTextField(15);
		s.add(t2);
		
		JButton button = new JButton("변환");
		s.add(button);
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Temperature frame = new Temperature();
		
	}

}
