package arr;

public class ArrayProcTest {

	public static void main(String[] args) {
		
		final int STUDENTS = 5;
		
		int[] array = new int[STUDENTS];
		ArrayProc cc = new ArrayProc();
		
		cc.getValues(array);
		
		System.out.println("∆Ú±’¿∫ = " + cc.getAverage(array));
	}

}
