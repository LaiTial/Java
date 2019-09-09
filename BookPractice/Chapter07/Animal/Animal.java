package animal;

public class Animal {

	private int weight;
	protected String picture;
	
	public void eat()
	{
		System.out.println("eat()가 호출되었음.");
	}
	
	public void sleep()
	{
		System.out.println("sleep()가 호출되었음.");
	}
}
