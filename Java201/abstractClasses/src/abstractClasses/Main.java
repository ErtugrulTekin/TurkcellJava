package abstractClasses;

public class Main {

	public static void main(String[] args) {
		Oyuncu oyuncu = new Basketbolcu();
		oyuncu.setIsim("Ali Can");
		oyuncu.setNumara(10);
		oyuncu.pasVer();
		oyuncu.sutCek();
	}
}
