package Box;

public class Box {
	
	private int width;
	private int length;
	private int height;
	
	public Box(int w, int l, int h)
	{
		width = w;
		length = l;
		height = h;
	}
	
	public boolean isSameBox(Box obj)
	{
		if((this.width == obj.width) && (this.height == obj.height) && (this.length == obj.length))
			return true;
		
		else
			return false;
	}

}
