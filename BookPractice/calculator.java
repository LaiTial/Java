package calculator;

import java.awt.*;
import javax.swing.*;

public class calculator extends JFrame{
	
	String[] labels = {"Backspace", "", "", "CE", "C",
						"7", "8", "9", "/", "sqrt",
						"4", "5", "6", "x", "%",
						"1", "2", "3", "-", "1/x",
						"0", "+/-", ".", "+", "="
						};
	private JButton[] buttons = new JButton[25];
	private JTextField tfield;
	int index = 0;
	
	public calculator()
	{
		JPanel panel = new JPanel();
		this.add(panel);
		
		tfield = new JTextField(60);
		this.add(tfield, BorderLayout.NORTH);
		tfield.setText("0.");
		tfield.setEnabled(false);
		
		
		panel.setLayout(new GridLayout(0, 5));
		
		for(int i=0; i<labels.length; i++)
		{
			buttons[i] = new JButton(labels[i]);
		}
		
		for(int i=0; i<5; i++)
			for(int j=0; j<5; j++)
			{
				if(j < 3)
					buttons[index].setForeground(Color.blue);

				else
					buttons[index].setForeground(Color.red);
				
				panel.add(buttons[index]);
				index++;
			}
		
		setSize(460, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calculator");
		setVisible(true);
		pack();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calculator cc = new calculator();
	}

}
