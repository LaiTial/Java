package Pizza;

import javax.swing.*;

public class PizzaMe extends JFrame{

	public PizzaMe()
	{
		JPanel bigpanel, litpanel1, litpanel2;
		bigpanel = new JPanel();
		litpanel1 = new JPanel();
		litpanel2 = new JPanel();
		
		this.add(bigpanel);
		bigpanel.add(litpanel1);
		bigpanel.add(litpanel2);
		
		JLabel mo = new JLabel("�ڹ� ���ڿ� ���� ���� ȯ���մϴ�. ���� ������ �����Ͻÿ�.");
		litpanel1.add(mo);
		
		JButton button1, button2, button3;
		button1 = new JButton("�޺� ����");
		button2 = new JButton("������������");
		button3 = new JButton("�Ұ������");
		
		litpanel2.add(button1);
		litpanel2.add(button2);
		litpanel2.add(button3);
		
		JLabel mo2 = new JLabel("����");
		litpanel2.add(mo2);
		
		JTextField text = new JTextField(10);
		litpanel2.add(text);
		
		setSize(600, 150);
		setVisible(true);
		setTitle("���� �ֹ� ȭ��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PizzaMe Pizza = new PizzaMe();
	}

}
