package EaMclass;

public class Employee {
	
	public String name;
	String adress;
	protected int salary;
	private int rrn;
	
	public Employee(String name, String adress, int salary, int rrn)
	{
		this.name = name;
		this.adress = adress;
		this.salary = salary;
		this.rrn = rrn;
	}
	
	@Override
	public String toString()
	{
		return "Employee [name=" + name + ", adress=" + adress + ", salary=" + salary + ", rrn=" + rrn + "]";
		
	}
}
