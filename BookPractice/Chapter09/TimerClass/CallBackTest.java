import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

class MyClass implements ActionListener {
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("beep");
	}
}

public class CallBackTest {

	public static void main(String[] args) {
		
		ActionListener lis = new MyClass();
		Timer t = new Timer(1000, lis);
		t.start();
		
		for(int i = 0; i < 10; i++)
		{
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {}
		}
	}

}
