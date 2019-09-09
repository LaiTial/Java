
public class Rectangle extends Shape{

	int width;
	int height;
	
	public double area()
	{
		return width*height;
	}
	
	public Rectangle(int x, int y, int a, int b) {
		super(x, y);
		// TODO Auto-generated constructor stub
		
		width = a;
		height = b;
	}
	
	public void draw()
	{
		System.out.println("(" + x + "," + y + ") 위치에 가로: " + width + " 세로: " + height);
	}

	
}
