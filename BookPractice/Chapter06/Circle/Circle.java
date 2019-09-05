package circle;

public class Circle {
	
	private int radius;
	private Point center;
	
	public Circle(int r, Point p)
	{
		radius = r;
		center = p;
	}
	
	@Override
	public String toString()
	{
		return "Circle [radius=" + radius + ", center=Point " + center.toString() + "]";
	}
}
