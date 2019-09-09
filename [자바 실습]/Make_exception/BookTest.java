
public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SeperateBook book = new SeperateBook("863b", "나무", "베르베르");
		Lendable arr[] = {new SeperateBook("8d", "cort", "빅셀")};

		try {
			book.checkOut("서경", "2006 10 01");
			book.checkOut("리아", "2006 10 01");
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

