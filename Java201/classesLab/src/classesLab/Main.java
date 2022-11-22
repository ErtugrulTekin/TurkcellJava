package classesLab;

public class Main {

	public static void main(String[] args) {
//		Kalem kursunKalem = new Kalem();
//		kursunKalem.marka = "A Marka";
//		kursunKalem.tip = "Kursun Kalem";
//		kursunKalem.doldurabilir = false;
//		kursunKalem.silinebilir = true;
//
//		kursunKalem.yaz("Merhaba Dunya");
//		kursunKalem.tekrarDoldur();
//		kursunKalem.sil();
//
//		System.out.println("---------------");
//		
//		Kalem dolmaKalem = new Kalem();
//		dolmaKalem.marka = "B Kalem";
//		dolmaKalem.tip = "Dolma Kalem";
//		dolmaKalem.doldurabilir = true;
//		dolmaKalem.silinebilir = false;
//
//		dolmaKalem.yaz("Java ile NYP");
//		dolmaKalem.tekrarDoldur();
//		dolmaKalem.sil();

//		Telefon telefon = new Telefon();
//		telefon.marka = "X Marka";
//		telefon.model = "Y Marka";
//		telefon.tip = TelefonTipi.CEP;
//		telefon.mobilVeri = true;
//		telefon.wifi = true;
//		
//		telefon.aramaYap("55554433");
//		telefon.aramayiSonlandir();
//		telefon.mesajGonder("Merhaba, nasılsın");

		Kopek kangal = new Kopek();
		kangal.cins = "Sivas Kangal";
		kangal.boyut = Boyut.BUYUK;
		kangal.renk = Renk.SIYAH;
		kangal.yas = 6;

		kangal.yemekYe();
		kangal.otur();
		kangal.kos();
		kangal.uyu();
	}

}
