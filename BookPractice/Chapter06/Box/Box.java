package test;

public class Box {
	
	private int width;
	private int length;
	private int height;
	private int volume;
	
	public int getVolume()
	{
		volume = width * height * length;	
		return volume;
	}
	
	public Box(int w, int l, int h)
	{
		width = w;
		length = l;
		height = h;
	}

}
