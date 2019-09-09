package land_rand;

import java.util.*;
import java.awt.*;
import javax.swing.*;

public class random_world extends JFrame{

	Random rand = new Random();
	int number;
	int x, y;
	String tem;
	JLabel[] label = new JLabel[30];
	
	public random_world()
	{
		JPanel panel = new JPanel();
		panel.setBackground(Color.yellow);
		panel.setLayout(null);
		this.add(panel);
		
	
		for(int i=0; i<30; i++)
		{
			number = rand.nextInt(100);
			tem = Integer.toString(number);
			label[i] = new JLabel();
			label[i].setText(tem);
		}


		for(int i=0; i<30; i++)
		{
			x = rand.nextInt(600);
			y = rand.nextInt(400);

			label[i].setForeground(Color.magenta);
			label[i].setSize(14, 14);
			label[i].setLocation(x, y);
			panel.add(label[i]);
		}

		setTitle("rand");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		random_world cc = new random_world(); 
	}

}
