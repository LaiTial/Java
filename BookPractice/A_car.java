
public class A_car implements Make_car_in{

	private int speed;
	private int degree;
	
	@Override
	public void start()
	{
		System.out.println("�ڵ����� ����մϴ�.");
	}
	
	@Override
	public void stop()
	{
		System.out.println("�ڵ����� �����մϴ�.");
	}
	
	@Override
	public int setSpeed(int speed)
	{
		this.speed = speed;
		System.out.println("�ڵ����� �ӵ��� " + speed + "km/h�� �ٲߴϴ�.");
		return speed;
	}
	
	@Override
	public int turn(int degree)
	{
		this.degree = degree;
		System.out.println("�ڵ����� ������ " + degree + "�� ��ŭ �ٲߴϴ�.");
		return degree;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A_car car = new A_car();
		
		car.start();
		car.setSpeed(30);
		car.turn(15);
		car.stop();
	}

}
