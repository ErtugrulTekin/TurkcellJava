package inheritanceLab;

public class Main {

	public static void main(String[] args) {
		Kisi kisi = new Kisi();
		kisi.setIsim("Tugrul Caliskan");
		System.out.println(kisi.getIsim());

		Ogrenci ogrenci = new Ogrenci();
		ogrenci.setIsim("Ali Can");
		ogrenci.setDers("Matematik");
		System.out.println(ogrenci.getIsim());
		System.out.println(ogrenci.getDers());
		
		UnivOgrenci univOgrenci = new UnivOgrenci();
		univOgrenci.setIsim("Mehmet Yildiz");
		univOgrenci.setDers("Bilgisayar Temelleri 101");
		univOgrenci.setKampus("Avcilar");
		System.out.println(univOgrenci.getIsim());
		System.out.println(univOgrenci.getDers());
		System.out.println(univOgrenci.getKampus());
		
		Ogretmen ogretmen = new Ogretmen();
		ogretmen.setIsim("Ahmet Yilmaz");
		ogretmen.setOkul("X ilk ogretim okulu");
		System.out.println(ogretmen.getIsim());
		System.out.println(ogretmen.getOkul());
		
		Doktor doktor = new Doktor();
		doktor.setIsim("Emre Aydin");
		doktor.setBrans("Beyin Cerrahisi");
		System.out.println(doktor.getIsim());
		System.out.println(doktor.getBrans());
	}
	

}
