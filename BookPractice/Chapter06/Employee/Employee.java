
public class Employee {

	private String name;
	private double salary;
	private static int count = 0;
	
	public static int getCount() {
		return count;
	}
	
	public Employee(String n, double s)
	{
		name = n;
		salary = s;
		++count;
	}
	
	public void finalize()
	{
		count--;
	}
	
	
	
}
