
public class A_car implements Make_car_in{

	private int speed;
	private int degree;
	
	@Override
	public void start()
	{
		System.out.println("자동차가 출발합니다.");
	}
	
	@Override
	public void stop()
	{
		System.out.println("자동차가 정지합니다.");
	}
	
	@Override
	public int setSpeed(int speed)
	{
		this.speed = speed;
		System.out.println("자동차가 속도를 " + speed + "km/h로 바꿉니다.");
		return speed;
	}
	
	@Override
	public int turn(int degree)
	{
		this.degree = degree;
		System.out.println("자동차가 방향을 " + degree + "도 만큼 바꿉니다.");
		return degree;
	}
	
	public static void main(String[] args) {
		
		A_car car = new A_car();
		
		car.start();
		car.setSpeed(30);
		car.turn(15);
		car.stop();
	}

}
