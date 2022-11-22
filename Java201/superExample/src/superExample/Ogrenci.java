package superExample;

public class Ogrenci extends Kisi{

	private int numara;
	
	public Ogrenci(String i, int n) {
		super(i);
		numara = n;
	}

	public int getNumara() {
		return numara;
	}

	public void setNumara(int n) {
		numara = n;
	}
	
	public void ozet() {
		System.out.println("Ogrenci Numara: "+ numara);
		super.bilgileriYazdir();
	}
}
