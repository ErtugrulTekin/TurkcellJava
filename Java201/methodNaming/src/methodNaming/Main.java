package methodNaming;

public class Main {

	private void helloWorld() {
		System.out.println("Hello World");
	}

	private int topla(int x, int y) {
		int toplam = x + y;
		return toplam;
	}
	
	private float topla(float x, int y) {
		float toplam = x + y;
		return (float)toplam;
	}
	
	private float topla(float x, float y) {
		float toplam = x + y;
		return (float)toplam;
	}
	
	private int topla(byte x, byte y) {
		int toplam = x + y;
		return toplam;
	}

	public static void main(String[] args) {
		new Main().helloWorld();

		Main main = new Main();
		int sonuc = main.topla(20, 30);
		
		main.topla(10, 20);
		
		System.out.println(sonuc);
	}
}
