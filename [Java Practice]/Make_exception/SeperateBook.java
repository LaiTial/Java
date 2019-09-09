
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
			throw new Exception("*����Ұ�: " + booktitle);
		
		this.borrower = borrower;
		this.checkOutDate = checkOutDate;
		this.state = STATE_BORROWED;
		
		System.out.println("*" + booktitle + "��(��) ����Ǿ����ϴ�.");
		System.out.println("������:" + borrower);
		System.out.println("������:" + checkOutDate + "\n");
	}
	
	public void checkIn()
	{
		this.borrower = null;
		this.checkOutDate = null;
		this.state = STATE_NORMAL;
		
		System.out.println("*" + booktitle + "��(��) �ݳ��Ǿ����ϴ�.");
	}
}
