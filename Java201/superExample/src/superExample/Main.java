package superExample;

public class Main {

	public static void main(String[] args) {
		Kisi kisi = new Kisi("Ertug Calıskan");
		System.out.println(kisi.getIsim());
	
		Ogrenci ogrenci = new Ogrenci("Goktug Calıskan", 2);
		System.out.println(ogrenci.getIsim());
		System.out.println(ogrenci.getNumara());
		
		ogrenci.ozet();
	}
}
