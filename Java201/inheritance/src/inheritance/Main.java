package inheritance;

public class Main {

	public static void main(String[] args) {
  		Sekil sekil = new Sekil();
  		sekil.setPosX(40);
  		sekil.setPosY(45);
  		sekil.setRenk("Kırmızı");
  		sekil.alanHesapla();
  		
  		System.out.println("--------------");
  		
		Kare kare = new Kare();
		kare.setPosX(10);
		kare.setPosY(10);
		kare.setRenk("Sarı");
		kare.setKenarUzunlugu(10);
		kare.alanHesapla();
		
		//System.out.println(kare.getKenarUzunlugu());

		System.out.println("--------------");
		
		Dikdortgen dikdortgen = new Dikdortgen();
		dikdortgen.setPosX(20);
		dikdortgen.setPosY(30);
		dikdortgen.setRenk("Mavi");
		dikdortgen.setYukseklik(10);
		dikdortgen.setUzunluk(5);
		dikdortgen.alanHesapla();
		
		System.out.println("--------------");

		Daire daire = new Daire();
		daire.setPosX(30);
		daire.setPosY(40);
		daire.setRenk("Siyah");
		daire.setYariCap(5);
		daire.alanHesapla();
		
	}

}
