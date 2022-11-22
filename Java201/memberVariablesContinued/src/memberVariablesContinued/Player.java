package memberVariablesContinued;

public class Player {
	int health = 100;
	
	static int numberOfPlayer = 0;
	
	public Player() {
		numberOfPlayer++;
	}

	void life() {
		health = 100;
	}

	void coup() {
		health--;
	}
	
	void numberOfPlayer() {
		System.out.println(numberOfPlayer);
	}
}
