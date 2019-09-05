package date;

public class Date {
	
	private int year;
	private String month;
	private int day;
	
	public Date(int y, String m, int d)
	{
		year = y;
		month = m;
		day = d;
	}
	
	public Date(int y)
	{
		this(y, "1¿ù", 1);
	}
	
	public Date()
	{
		this(1900, "1¿ù", 1);
	}
	
	@Override
	public String toString()
	{
		return "Date [year=" + year + ", month=" + month + ", day=" + day + "]";
	}

}
