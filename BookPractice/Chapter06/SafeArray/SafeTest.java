package safety;

public class SafeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SafeArray cx = new SafeArray(3);
		
		for(int i=0; i<(cx.length)+1; i++)
		{
			cx.setA(i, i*10);
		}
	}

}
