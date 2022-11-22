package polymorphism2;

public class Kare extends Sekil {

	private int kenaruzunlugu;

	public Kare(int u) {
		kenaruzunlugu = u;
	}

	public int getKenaruzunlugu() {
		return kenaruzunlugu;
	}

	public void setKenaruzunlugu(int u) {
		kenaruzunlugu = u;
	}

	public void alan() {
		System.out.println("Kare Alan: " + (Math.pow(kenaruzunlugu, 2)));
	}
}
