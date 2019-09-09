import java.awt.FlowLayout;

import javax.swing.*;

public class FlowLayoutMake extends JFrame{

	private int num = 1;;
	private String temp = "Button", button;
	
	public FlowLayoutMake()
	{
		JPanel panel = new JPanel();
		this.add(panel);
		
		panel.setLayout(new FlowLayout());
		
		for(int i=0; i<=9; i++)
		{
			button = temp + i;
			panel.add(new JButton(button));
		}

		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setTitle("My Frame");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FlowLayoutMake frame = new FlowLayoutMake();
	}

}
