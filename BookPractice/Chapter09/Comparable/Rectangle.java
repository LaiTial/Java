
public class Rectangle implements Comparable {

	private int width, height;
	
	public Rectangle(int w, int h)
	{
		width = w;
		height = h;
		System.out.println(this.toString());
	}
	
	@Override
	public String toString()
	{
		return "Rectangle [width=" + width + ", height=" + height + "]";	
		
		
		
		
	}
	
	public int cm()
	{
		return width*height;
	}
	
	@Override
	public int compareTo(Object object) {

		Rectangle compare = (Rectangle) object;
		
		if(this.cm() > compare.cm())
			return 1;
		
		else if(this.cm() < compare.cm())
			return -1;
		
		else
			return 0;
	}

	
}
