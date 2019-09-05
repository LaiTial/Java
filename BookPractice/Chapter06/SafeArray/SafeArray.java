package safety;

public class SafeArray {
	
	private int[] a;
	public int length;
	
	public SafeArray(int size) {

		a = new int[size];
		length = size;
	}
	
	public int getA(int index) {
		
		if(index >=0 && index <length)
		{
			return a[index];
		}
		return -1;

	}
	public void setA(int index, int value) {
		
		if(index >=0 && index <length)
		{
			a[index] = value;
		}
		
		else
			System.out.println("잘못된 인덱스 " + index);
		
	}
	
}
