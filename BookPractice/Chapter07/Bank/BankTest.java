package bb;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BadBank b1 = new BadBank();
		NormalBank b2 = new NormalBank();
		GoodBank b3 = new GoodBank();
		
		System.out.println("BadBank�� ������: " + b1.getInterestRank());
		System.out.println("NormalBank�� ������: " + b2.getInterestRank());
		System.out.println("GoodBank�� ������: " + b3.getInterestRank());
	}

}
