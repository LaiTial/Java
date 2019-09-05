package time;

public class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	public Time(int h, int m, int s)
	{
		if((h < 24) && (h >=0)) //���� �����ڷε� ����
		{
			hour = h;
		}
		
		if((s < 60) && (s >=0)) //���� �����ڷε� ����
		{
			second = s;
		}
		
		if((m < 60) && (m >=0)) //���� �����ڷε� ����
		{
			minute = m;
		}
	}
	
	public Time()
	{
		this(0, 0, 0);
	}

	@Override
	public String toString()
	{
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
}
