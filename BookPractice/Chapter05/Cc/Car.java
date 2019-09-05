package Cc;

public class Car {

	String colro;
	int gear;
	int speed;
	
	void changeGear(int g) {
		gear = g;
	}
	
	void speedUP()
	{
		speed += 10;
	}
	
	void speedDown()
	{
		speed += -10;
	}
	
	String tostring()
	{
		return "Car [color=" + colro + ", speed=" + speed + ", gear=" + gear + "]";
	}
}
