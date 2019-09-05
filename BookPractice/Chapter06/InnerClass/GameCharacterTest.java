package Game;

public class GameCharacterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GameCharacter cx = new GameCharacter();
		cx.add("Sword", 1, 100);
		cx.add("art", 4, 600);
		cx.add("Online", 2, 30);
		
		cx.print();
	}

}
