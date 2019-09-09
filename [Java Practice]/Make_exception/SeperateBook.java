
public class SeperateBook implements Lendable{

	String requestNo;
	String booktitle;
	String writer;
	String borrower;
	String checkOutDate;
	byte state;
	
	public SeperateBook(String requestNo, String booktitle, String writer)
	{
		this.requestNo = requestNo;
		this.booktitle = booktitle;
		this.writer = writer;
	}
	
	public void checkOut(String borrower, String checkOutDate) throws Exception
	{
		if(state != STATE_NORMAL)
			throw new Exception("*대출불가: " + booktitle);
		
		this.borrower = borrower;
		this.checkOutDate = checkOutDate;
		this.state = STATE_BORROWED;
		
		System.out.println("*" + booktitle + "이(가) 대출되었습니다.");
		System.out.println("대출인:" + borrower);
		System.out.println("대출일:" + checkOutDate + "\n");
	}
	
	public void checkIn()
	{
		this.borrower = null;
		this.checkOutDate = null;
		this.state = STATE_NORMAL;
		
		System.out.println("*" + booktitle + "이(가) 반납되었습니다.");
	}
}
