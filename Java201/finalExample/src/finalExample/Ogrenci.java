package finalExample;

public /*final*/ class Ogrenci {

	private final int numara;

	public Ogrenci(int n) {
		numara = n;
	}

	public int getNumara() {
		return numara;
	}

	public final void yazdir() {
		System.out.println(numara);
	}
}
