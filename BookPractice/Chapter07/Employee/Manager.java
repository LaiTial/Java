package EaMclass;

public class Manager extends Employee {

	public Manager(String name, String adress, int salary, int rrn, int bonus) {
		super(name, adress, salary, rrn);
		// TODO Auto-generated constructor stub
		
		this.bonus = bonus;
	}

	private int bonus;
	
	public void test()
	{
		System.out.println("name=" + name);
		System.out.println("adress=" + adress);
		System.out.println("salary=" + salary);
		//System.out.println("rrn=" + rrn); private는 상속되지 않는다
	}
}
