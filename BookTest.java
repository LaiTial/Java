
public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SeperateBook book = new SeperateBook("863b", "����", "��������");
		Lendable arr[] = {new SeperateBook("8d", "cort", "��")};

		try {
			book.checkOut("����", "2006 10 01");
			book.checkOut("����", "2006 10 01");
		}
		
		catch(Exception e){
			String msg = e.getMessage();
			System.out.println(msg);
		}
		
		finally {
			book.checkIn();
		}
	}

}

